/**
 * main for the ts system
 *
 */

package ts;

import ts.parse.*;
import ts.tree.*;
import ts.tree.visit.*;
import ts.support.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.Token;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/** Main class for the Tscript interpreter. Processes command-line
 *  arguments, initiates the parser and lexer, and then evaluates
 *  the AST built by the parser.
 */
public class Main
{
  /** Tracks compiler version. */
  public static final String version = "0.01";

  private static String determineBaseFileName(String sourceFile)
  {
    // the following require Java 1.7
    Path path = Paths.get(sourceFile);
    String fileName = path.getFileName().toString();
    return fileName.substring(0, fileName.length() - 3);
  }

  // open an output file, when the output file name is based
  // upon the source file name
  private static PrintWriter openOutputFile(String outputClassName,
    String fileExtension)
  {
    String outFile = outputClassName + fileExtension;
    Message.log("output file created: " + outFile);
    try {
      return new PrintWriter(outFile);
    }
    catch (Exception e)
    {
      Message.fatal("problem creating " + outFile + "(" + e.toString() +
        ")");
      // fatal terminates program so this cannot be reached
      return null;
    }
  }

  /** Execution starts here. */
  public static void main(String[] args) throws IOException
  {
    String sourceFile = null;
    boolean doDump = false;
    boolean doEval = true;
    ANTLRInputStream reader = null;

    // process the command-line arguments
    //   all options must be first
    //     -log for displaying internal implementation messages
    //     -dump for dumping the AST
    //     -noeval to disable evaluation of the program
    //   after the options the source file name must be given
    //     source file name must end in ".ts"
    for (String arg: args)
    {
      // source file name must be given last
      if (sourceFile != null)
      {
        Message.usage();
      }

      // handle options, which can be given redundantly
      if (arg.equals("-dump"))
      {
        doDump = true;
      }
      else if (arg.equals("-log"))
      {
        Message.enableLogging();
      }
      else if (arg.equals("-noeval"))
      {
        doEval = false;
      }
      // if not a valid option then it is assumed to be the source file name
      else
      {
        sourceFile = arg;
      }
    }
    // source file name must be given and it must end with ".ts"
    if (sourceFile == null || !sourceFile.endsWith(".ts"))
    {
      Message.usage();
    }
    Message.log(sourceFile + ": doDump is " + doDump);

    String baseFileName = determineBaseFileName(sourceFile);

    // open the source file
    try {
      reader = new ANTLRFileStream(sourceFile);
    }
    catch (Exception e)
    {
      Message.fatal("problem opening " + sourceFile + "(" + e.toString() + ")");
    }

    // create the lexer
    TscriptLexer lexer = new TscriptLexer(reader);
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    // create the parser
    TscriptParser parser = new TscriptParser(tokens);

    // will build my own abstract syntax tree
    parser.setBuildParseTree(false);

    // quit with first syntax error
    parser.setErrorHandler(new BailWithNoMessageErrorStrategy());

    // start the parser
    //   note: the method name is the name of the start symbol in the grammar
    try {
      parser.program();
    }
    catch (ParseCancellationException pce)
    {
      // underlying recognition exception is wrapped in the
      // parse cancellation exception that is thrown by the
      // bail error strategy. Use getCause inherited from
      // Throwable to get the recognition exception.
      RecognitionException re = (RecognitionException) pce.getCause();
      Token errorToken = re.getOffendingToken();
      Location loc = new Location(
        errorToken.getTokenSource().getSourceName(),
        errorToken.getLine(),
        errorToken.getCharPositionInLine()
      );
      Message.syntaxError(loc);   // exits the program
    }

    // a program is a List<Statement>
    // (use unbounded wildcard to avoid unchecked cast)
    List<?> root = (List<?>) parser.getSemanticValue();

    // count the number of statements
    int count = 0;
    for (Object item : root)
    {
      assert (item instanceof Statement) :
        "non-statement in statement list at root of AST";;
      count += 1;
    }
    Message.log(String.format("%d statements at parse tree root", count));

    // if requested, dump the AST
    if (doDump)
    {
      // determine dump file name (file.ts --> file.html)
      //   note that the dump file will be written in the current directory
      PrintWriter dumper = openOutputFile(baseFileName, ".html");

      dumper.println("<head>");
      dumper.println("<title> AST for " + sourceFile + "</title>");
      dumper.println("</head>");
      dumper.println("<body>");
      dumper.println("<pre>");
      dumper.println("Program");
      TreeDump treeDump = new TreeDump(dumper, 2, 2);
      for (Object item : root)
      {
        Tree t = (Tree) item;
        t.apply(treeDump);
      }
      dumper.println("</pre>");
      dumper.close();
    }

    // if requested, evaluate the AST
    if (doEval)
    {
      if (Message.getErrorCount() != 0)
      {
        Message.fatal("evaluation skipped due to semantic errors");
      }

      TreeEvaluate treeEval = new TreeEvaluate();
      for (Object item : root)
      {
        Tree t = (Tree) item;
        TSCompletion completion = t.apply(treeEval);
        if (!completion.isNormal())
        {
          Message.fatal("evaluation completed abnormally!");
        }
      }
    }

  }
}
