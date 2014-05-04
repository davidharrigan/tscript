
package ts.tree.visit;

import ts.tree.*;

import java.io.PrintWriter;
import java.util.List;

/**
 * Dump an AST to a stream. Uses prefix order with indentation.
 * <p>
 * Using Object for the type parameter but there is really no return type.
 * <p>
 * The "visit" method is overloaded for each tree node type.
 */
public final class TreeDump extends TreeVisitorBase<Object>
{
  // where to write the dump to
  private PrintWriter writer;

  // current indentation amount
  private int indentation;

  // how much to increment the indentation by at each level
  // using an increment of zero would mean no indentation
  private int increment;

  // by default start even to the left margin and increment indentation
  // by 2 spaces
  public TreeDump(final PrintWriter writer)
  {
    this(writer, 0, 2);
  }

  public TreeDump(final PrintWriter writer, final int indentation,
    final int increment)
  {
    this.writer = writer;
    this.indentation = indentation;
    this.increment = increment;
  }

  // generate a string of spaces for current indentation level
  private void indent()
  {
    for (int i = 0; i < indentation; i++)
    {
      writer.print(" ");
    }
  }

  // visit a list of ASTs and dump them in order
  // use wildcard for generality: list of Statements, list of Expressions, etc
  public List<Object> visitEach(final Iterable<?> nodes)
  {
    for (final Object node : nodes)
    {
      visitNode((Tree) node);
    }
    return null;
  }
  
  public Object visit(final BinaryOperator binaryOperator)
  {
    indent();
    writer.println(binaryOperator.getOpString());
    indentation += increment;
    visitNode(binaryOperator.getLeft());
    visitNode(binaryOperator.getRight());
    indentation -= increment;
    return null;
  }

  public Object visit(final UnaryOperator unaryOperator)
  {
    indent();
    writer.println(unaryOperator.getOpString());
    indentation += increment;
    visitNode(unaryOperator.getLeft());
    indentation -= increment;
    return null;
  }


  public Object visit(final ExpressionStatement expressionStatement)
  {
    indent();
    writer.println("ExpressionStatement");
    indentation += increment;
    visitNode(expressionStatement.getExp());
    indentation -= increment;
    return null;
  }

  public Object visit(final Identifier identifier)
  {
    indent();
    writer.println("Identifier " + identifier.getName());
    return null;
  }

  public Object visit(final NumericLiteral numericLiteral)
  {
    indent();
    writer.println("NumericLiteral " + numericLiteral.getValue());
    return null;
  }

  public Object visit(final PrintStatement printStatement)
  {
    indent();
    writer.println("PrintStatement");
    indentation += increment;
    visitNode(printStatement.getExp());
    indentation -= increment;
    return null;
  }

  public Object visit(final VarStatement varStatement)
  {
    indent();
    writer.println("Var " + varStatement.getName());
    return null;
  }

  public Object visit(final BooleanLiteral boolLiteral)
  {
    indent();
    writer.println("BooleanLiteral " + boolLiteral.getValue());
    return null;
  }

  public Object visit(final StringLiteral stringLiteral)
  {
    indent();
    writer.println("StringLiteral " + stringLiteral.getValue());
    return null;
  }

  public Object visit(final NullLiteral nullLiteral)
  {
    indent();
    writer.println("NullLiteral ");
    return null;
  }

  public Object visit(final BlockStatement blockStatement) 
  {
    indent();
    writer.println("BlockStatement");
    indentation += increment;
    if (blockStatement.getStatements() != null) 
      visitEach(blockStatement.getStatements());
    if (blockStatement.getStatement() != null)
    visitNode(blockStatement.getStatement());
    indentation -= increment;
    return null;
  }

  public Object visit(final EmptyStatement emptyStatement)
  {
    indent();
    writer.println("EmptyStatement");
    return null;
  }

  public Object visit(final WhileStatement whileStatement)
  {
    indent();
    writer.println("WhileStatement");
    indentation += increment;
    visitNode(whileStatement.getExpression());
    visitNode(whileStatement.getStatement());
    indentation -= increment;
    return null;
  }

  public Object visit(final IfStatement ifStatement)
  {
    indent();
    writer.println("IfStatement");
    indentation += increment;
    visitNode(ifStatement.getExpression());
    visitNode(ifStatement.getStatement1());
    if (ifStatement.getStatement2() != null)
      visitNode(ifStatement.getStatement2());
    indentation += increment;
    return null;
  }

  public Object visit(final BreakStatement breakStatement)
  {
    indent();
    String name = (breakStatement.getName() == null) ? "" : breakStatement.getName();
    writer.println("BreakStatement " + name);
    return null;
  }
  
  public Object visit(final ContinueStatement continueStatement)
  {
    indent();
    String name = (continueStatement.getName() == null) ? "" : continueStatement.getName();
    writer.println("ContinueStatement " + name);
    return null;
  }
  
  public Object visit(final LabelledStatement labelledStatement)
  {
    indent();
    String name = labelledStatement.getName();
    Statement s = labelledStatement.getStatement();
    writer.println("LabelledStatement " + name);
    indentation += increment;
    visitNode(s);
    indentation -= increment;
    return null;
  }
  
  public Object visit(final ThrowStatement throwStatement)
  {
    indent();
    writer.println("ThrowStatement");
    indentation += increment;
    visitNode(throwStatement.getExpression());
    indentation -= increment;
    return null;
  }
  
  public Object visit(final TryStatement tryStatement)
  {
    indent();
    writer.println("TryStatement");
    indentation += increment;
    visitNode(tryStatement.getStatement());
    Expression c = tryStatement.getCatchClause();
    Expression f = tryStatement.getFinallyClause();
    if (c != null)
      visitNode(c);
    if (f != null)
      visitNode(c);
    indentation -= increment;
    return null;
  }
  
  public Object visit(final CatchClause catchClause)
  {
    indent();
    writer.println("CatchClause " + catchClause.getName());
    indentation += increment;
    visitNode(catchClause.getStatement());
    indentation -= increment;
    return null;
  }
  
  public Object visit(final FinallyClause finallyClause)
  {
    indent();
    writer.println("FinallyClause");
    indentation += increment;
    visitNode(finallyClause.getStatement());
    indentation -= increment;
    return null;
  }
    
  public Object visit(final FunctionExpression functionExpression)
  {
    String n = (functionExpression.getName() == null) ? "" : functionExpression.getName();
    indent();
    writer.println("FunctionExpression " + n);
    indentation += increment;
    visitEach(functionExpression.getBody());
    List<String> paramList = functionExpression.getParameterList();
    if (paramList != null) {
      writer.println("ParameterList");
      for (String s: paramList) {
        indent();
        writer.println(s);
      }
    }
    indentation -= increment;
    return null;
  }
  
  public Object visit(final FunctionCall functionCall)
  {
    indent();
    writer.println("FunctionCall");
    indentation += increment;
    visitNode(functionCall.getExpression());
    visitEach(functionCall.getArguments());
    indentation -= increment;
    return null;
  }

  public Object visit(final ReturnStatement returnStatement)
  {
    indent();
    writer.println("ReturnStatement");
    indentation += increment;
    if (returnStatement.getExpression() != null)
      visitNode(returnStatement.getExpression());
    indentation -= increment;
    return null;
  }

  public Object visit(final NewExpression newExpression)
  {
    indent();
    writer.println("NewExpression");
    indentation += increment;
    if (newExpression.getExpression() != null)
      visitNode(newExpression.getExpression());
    indentation -= increment;
    return null;
  }  

  public Object visit(final MemberExpression memberExpression)
  {
    indent();
    writer.println("MemberExpression");
    indentation += increment;
    if (memberExpression.getArguments() != null)
      visitEach(memberExpression.getArguments());
    if (memberExpression.getExpression() != null)
      visitNode(memberExpression.getExpression());
    indentation -= increment;
    return null;
  }

  public Object visit(final PropertyAccessor p)
  {
    indent();
    writer.println("PropertyAccessor");
    indentation += increment;
    writer.println(p.getName());
    visitNode(p.getExpression());
    indentation -= increment;
    return null;
  }

  public Object visit(final Arguments a)
  {
    indent();
    writer.println("Arguments");
    indentation += increment;
    visitEach(a.getArgumentList());
    indentation -= increment;
    return null;
  }

  public Object visit(final This t)
  {
    indent();
    writer.println("This");
    return null;
  }

  public Object visit(final ArrayLiteral a) 
  {
    indent();
    writer.println("ArrayLiteral");
    return null;
  }

  public Object visit(final ArrayAccessor a) 
  {
    indent();
    writer.println("Array Accessor");
    return null;
  }
}

