
package ts.tree.visit;

import ts.tree.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Base implementation for AST visitors. Performs complete traversal
 * but does nothing. Parameterized by return value.
 * <p>
 * The "visit" method is overloaded for every tree node type.
 */
public class TreeVisitorBase<T> implements TreeVisitor<T>
{
  // override to add pre- and/or post-processing
  protected T visitNode(final Tree node)
  {
    return node.apply(this);
  }

  // visit a list of ASTs and return list of results
  // use wildcard to allow general use, with list of Statements, list
  //   of Expressions, etc
  protected List<T> visitEach(final Iterable<?> nodes)
  {
    final List<T> visited = new ArrayList<T>();
    for (final Object node : nodes)
    {
      visited.add(visitNode((Tree) node));
    }
    return visited;
  }
  
  public T visit(final BinaryOperator binaryOperator)
  {
    visitNode(binaryOperator.getLeft());
    visitNode(binaryOperator.getRight());
    return null;
  }

  public T visit(final UnaryOperator unaryOperator)
  {
    visitNode(unaryOperator.getLeft());
    return null;
  }

  public T visit(final ExpressionStatement expressionStatement)
  {
    visitNode(expressionStatement.getExp());
    return null;
  }

  public T visit(final Identifier identifier)
  {
    return null;
  }

  public T visit(final NumericLiteral numericLiteral)
  {
    return null;
  }

  public T visit(final PrintStatement printStatement)
  {
    visitNode(printStatement.getExp());
    return null;
  }

  public T visit(final VarStatement varStatement)
  {
    return null;
  }

  public T visit(final BooleanLiteral booleanLiteral) 
  {
    return null;
  }

  public T visit(final StringLiteral stringLiteral) 
  {
    return null;
  }

  public T visit(final NullLiteral nullLiteral)
  {
    return null;
  }

  public T visit(final BlockStatement blockStatement) 
  {
    visitEach(blockStatement.getStatements());
    return null;
  }

  public T visit(final EmptyStatement empty)
  {
    return null;
  }

  public T visit(final WhileStatement whileStatement) 
  {
    return null;
  }

  public T visit(final IfStatement ifStatement)
  {
    return null;
  }

  public T visit(final BreakStatement breakStatement)
  {
    return null;
  }

  public T visit(final ContinueStatement continueStatement)
  {
    return null;
  }

  public T visit(final LabelledStatement labelledStatement)
  {
    return null;
  }

  public T visit(final ThrowStatement throwStatement)
  {
    return null;
  }

  public T visit(final TryStatement tryStatement)
  {
    return null;
  }

  public T visit(final CatchClause catchClause)
  {
    return null;
  }

  public T visit(final FinallyClause finallyClause)
  {
    return null;
  }

  public T visit(final FunctionExpression functionExpression)
  {
    return null;
  }

  public T visit(final FunctionCall functionCall)
  {
    return null;
  }

  public T visit(final ReturnStatement returnStatement)
  {
    return null;
  }
} 

