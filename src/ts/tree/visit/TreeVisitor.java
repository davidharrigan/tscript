
package ts.tree.visit;

import java.util.Stack;

import ts.tree.*;

/**
 * All visitor classes for ASTs will implement this interface, which
 *   is parameterized by return type.
 *
 */
public interface TreeVisitor<T>
{
  Stack<String> labelStack = new Stack<String>();

  T visit(BinaryOperator binaryOperator);

  T visit(UnaryOperator unaryOperator);

  T visit(ExpressionStatement expressionStatement);

  T visit(Identifier identifier);

  T visit(NumericLiteral numericLiteral);

  T visit(PrintStatement printStatement);

  T visit(VarStatement varStatement);

  T visit(BooleanLiteral booleanLiteral);

  T visit(StringLiteral stringLiteral);

  T visit(NullLiteral nullLiteral);

  T visit(BlockStatement blockStatement);

  T visit(EmptyStatement emptyStatement);

  T visit(WhileStatement whileStatement);

  T visit(IfStatement ifStatement);

  T visit(BreakStatement breakStatement);

  T visit(ContinueStatement continueStatement);

  T visit(LabelledStatement labelledStatement);

  T visit(ThrowStatement throwStatement);

  T visit(TryStatement tryStatement);

  T visit(CatchClause catchClause);

  T visit(FinallyClause finallyClause);

  T visit(FunctionExpression functionExpression);

  T visit(FunctionCall functionCall);

  T visit(ReturnStatement returnStatement);

  T visit(NewExpression newExpression);

  T visit(MemberExpression memberExpression);

  T visit(PropertyAccessor propertyAccessor);

  T visit(Arguments args);

  T visit(This t);
}

