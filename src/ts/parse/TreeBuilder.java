package ts.parse;

import java.util.List;

import ts.support.TSLexicalEnvironment;
import ts.Location;
import ts.Message;
import ts.tree.*;

/**
 * Provides static methods for building AST nodes
 */
public class TreeBuilder
{

  /** Build a "var" statement.
   *
   *  @param  loc  location in source code (file, line, column)
   *  @param  name name of variable being declared.
   */
  public static Statement buildVarStatement(final Location loc,
    final String name)
  {
    Message.log("TreeBuilder: VarStatement");
    return new VarStatement(loc, name);
  }

  /** Build a expression statement.
   *
   *  @param  loc  location in source code (file, line, column)
   *  @param  exp  expression subtree
   */
  public static Statement buildExpressionStatement(final Location loc,
    final Expression exp)
  {
    Message.log("TreeBuilder: ExpressionStatement");
    return new ExpressionStatement(loc, exp);
  }

  /** Build a binary operator.
   *
   *  @param  loc   location in source code (file, line, column)
   *  @param  op    the binary operator
   *  @param  left  the left subtree
   *  @param  right the right subtree
      @see Binop
   */
  public static Expression buildBinaryOperator(final Location loc,
    final Binop op,
    final Expression left, final Expression right)
  {
    Message.log("TreeBuilder: Binop " + op.toString());

    return new BinaryOperator(loc, op, left, right);
  }

  /** Build a unary operator.
   *
   *  @param  loc   location in source code (file, line, column)
   *  @param  op    the binary operator
   *  @param  left  the left subtree
      @see Binop
   */
  public static Expression buildUnaryOperator(final Location loc,
    final Uop op,
    final Expression left)
  {
    Message.log("TreeBuilder: Uop " + op.toString());
    return new UnaryOperator(loc, op, left);
  }

  /** Build a identifier expression.
   *
   *  @param  loc  location in source code (file, line, column)
   *  @param  name name of the identifier.
   */
  public static Expression buildIdentifier(final Location loc,
    final String name)
  {
    Message.log("TreeBuilder: Identifier (" + name + ")");
    return new Identifier(loc, name);
  }

  /** Build a null literal expression. Converts the String for the 
      value to a null

      @param loc    location in source code (file, line, column)
  */
  public static Expression buildNullLiteral(final Location loc)
  {
    Message.log("TreeBuilder: NullLiteral");
    return new NullLiteral(loc, null);
  }

  /** Build a numeric literal expression. Converts the String for
   *  the value to a double.
   *
   *  @param  loc   location in source code (file, line, column)
   *  @param  value value of the literal as a String
   */
  public static Expression buildNumericLiteral(final Location loc,
    final String value)
  {
    double d = 0.0;

    if (value.length() > 2 && (value.substring(0,2).equals("0x") || value.substring(0,2).equals("0X"))) {
        try 
        {
          d = (double)Long.parseLong(value.substring(2), 16);
        }
        catch(NumberFormatException nfe)
        {
          Message.bug(loc, "numeric literal not parsable ");
        }
    }
    else 
    {
      try
      {
        d = Double.parseDouble(value);
      }
      catch(NumberFormatException nfe)
      {
          Message.bug(loc, "numeric literal not parsable " );  
      }
    }
    Message.log("TreeBuilder: NumericLiteral " + d);
    return new NumericLiteral(loc, d);
  }

  /** Build a string literal
   *  
   * @param loc    location in source code (file, line, column)
   * @param value  value in string
   */
  public static Expression buildStringLiteral(final Location loc, 
    final String value) 
  {
    String s = value.substring(1, value.length()-1);
    s = s.replace("\\n", "\n");
    Message.log("TreeBuilder: StringLiteral " + s);
    return new StringLiteral(loc, s);
  }

  /** Build a boolean literal
   *  
   * @param loc    location in source code (file, line, column)
   * @param value  value in string
   */
  public static Expression buildBooleanLiteral(final Location loc, 
    final String value)
  {
    boolean b; 
    char first = Character.toUpperCase(value.charAt(0));
    String new_value = first + value.substring(1);    
      b = Boolean.parseBoolean(new_value);
      return new BooleanLiteral(loc, b);
  }

  /** Build a print statement.
   *
   *  @param  loc  location in source code (file, line, column)
   *  @param  exp  expression subtree.
   */
  public static Statement buildPrintStatement(final Location loc,
    final Expression exp)
  {
    Message.log("TreeBuilder: PrintStatement");
    return new PrintStatement(loc, exp);
  }


  /** Build a block statement.
   *
   *  @param  loc         location in source code (file, line, column)
   *  @param  statements  statement list
   */
  public static Statement buildBlockStatement(final Location loc, 
    final List<Statement> statements)
  {
    Message.log("TreeBuilder: BlockStatment");
    return new BlockStatement(loc, statements);
  }

  /** Build an empty statement
   *
   *  @param  loc  location in source code (file, line, column)
   */
  public static Statement buildEmptyStatement(final Location loc) 
  {
    Message.log("TreeBuilder: EmptyStatement");
    return new EmptyStatement(loc);
  }

  /** Build a while statement
   *
   *  @param  loc         location in source code (file, line, column)
   *  @param  expression  expression sub tree
   *  @param  statements  statement list
   */
  public static Statement buildWhileStatement(final Location loc, 
    final Expression expression,
    final List<Statement> statements 
    )
  {
    Message.log("TreeBuilder: WhileStatement");
    return new WhileStatement(loc, expression, statements);
  }

  /** Build a if statement
   *
   *  @param  loc        location in source code (file, line, column)
   *  @param  expression expression sub tree
   *  @param  statement1 statement list to be evaluated if 'if' is true
   *  @param  statement2 statement list to be evaluated if 'if' is false
   */
  public static Statement buildIfStatement(final Location loc, 
      final Expression expression,
      final List<Statement> statement1,
      final List<Statement> statement2)
  {
    Message.log("TreeBuilder: IfStatement");
    return new IfStatement(loc, expression, statement1, statement2);
  }

  /** Build a break statement
   *
   *  @param  loc   location in source code (file, line, column)
   *  @param  name  label name, can be null
   */
  public static Statement buildBreakStatement(final Location loc,
      final String name)
  {
    Message.log("TreeBuilder: BreakStatement");
    return new BreakStatement(loc, name);
  }

  /** Build a continue statement
   * 
   *  @param  loc   location in source code (file, line, column)
   *  @param  name  label name, can be null
   */
  public static Statement buildContinueStatement(final Location loc,
      final String name)
  {
    Message.log("TreeBuilder: ContinueStatement");
    return new ContinueStatement(loc, name);
  }

  /** Build a labelled statement
   *
   *  @param  loc        location in source code (file, line, column)
   *  @param  name       name of the label being declared
   *  @param  statements  list of statements to be evaluated within the label statement
   */
  public static Statement buildLabelledStatement(final Location loc,
      final String name,
      final List<Statement> statements) 
  {
    Message.log("TreeBuilder: buildLablledStatement");
    return new LabelledStatement(loc, name, statements);
  }

  /** Build a throw statement
   *
   *  @param  loc         location in source code (file, line, column)
   *  @param  expression  expression sub tree
   */
  public static Statement buildThrowStatement(final Location loc,
    final Expression expression)
  {
    Message.log("TreeBuilder: buildThrowStatement");
    return new ThrowStatement(loc, expression);
  }

  /** Build a Try Statement
   *
   *  @param  loc            location in source code (file, line, column)
   *  @param  block          statement to be evaluated in the try statement
   *  @param  catchClause    catchClause expression sub tree, can be null
   *  @param  finallyClause  finallyClause expression sub tree, can be null
   */
  public static Statement buildTryStatement(final Location loc, 
    final Statement block, final Expression catchClause, 
    final Expression finallyClause)
  {
    Message.log("TreeBuilder: buildTryStatement");
    return new TryStatement(loc, block, catchClause, finallyClause);
  }

  /** Build a Catch Clause
   *
   *  @param  loc    location in source code (file, line, column)
   *  @param  name   name of the exception to catch
   *  @param  block  statement to be evaluated within the clause
   */
  public static Expression buildCatchClause(final Location loc, 
    final String name, final Statement block)
  {
    Message.log("TreeBuilder: buildCatchClause");
    return new CatchClause(loc, name, block);
  }

  /** Build a Finally Clause
   *
   *  @param  loc    location in source code (file, line, column)
   *  @param  block  statement to be evaluated within the clause
   */
  public static Expression buildFinallyClause(final Location loc,
    final Statement block)
  {
    Message.log("TreeBuilder: buildFinallyClause");
    return new FinallyClause(loc, block);
  }

  /** Build a Function Expression
   *
   *  @param  loc        location in source code (file, line, column)
   *  @param  name       name of the function, can be null
   *  @param  statement  code to be evaluated within the function
   */
  public static Expression buildFunctionExpression(final Location loc, 
      final String name,
      final List<Statement> statement)
  {
    Message.log("TreeBuilder: buildFunctionExpression");
    return new FunctionExpression(loc, name, statement);
  }

  /** Build a Function Call
   * 
   *  @param  loc         location in source code (file, line, column)
   *  @param  expression  expression sub tree
   */
  public static Expression buildFunctionCall(final Location loc,
      final Expression expression)
  {
    Message.log("TreeBuilder: buildFunctionCall");
    return new FunctionCall(loc, expression);
  }

  //
  // methods to detect "early" (i.e. semantic) errors
  //

  // helper function to detect "reference expected" errors
  private static boolean producesReference(Node node)
  {
    if (node instanceof Identifier)
    {
      return true;
    }
    return false;
  }
  
  /** Used to detect non-references on left-hand-side of assignment.
   *
   *  @param  loc  location in source code (file, line, column)
   *  @param  node tree to be checked
   */
  public static void checkAssignmentDestination(Location loc, Node node)
  {
    if (!producesReference(node))
    {
      Message.error(loc, "assignment destination must be a Reference");
    }
  }

}