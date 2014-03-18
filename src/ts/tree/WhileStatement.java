package ts.tree;

import java.util.List;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * The production IterationStatement : while ( Expression ) Statement is evaluated as follows:
 *
 *   Let V = empty.
 *   Repeat
 *       Let exprRef be the result of evaluating Expression.
 *       If ToBoolean(GetValue(exprRef)) is false, return (normal, V, empty).
 *       Let stmt be the result of evaluating Statement.
 *       If stmt.value is not empty, let V = stmt.value.
 *       If stmt.type is not continue || stmt.target is not in the current label set, then
 *           If stmt.type is break and stmt.target is in the current label set, then
 *               Return (normal, V, empty).
 *           If stmt is an abrupt completion, return stmt.
 */
public final class WhileStatement extends Statement 
{
	private Statement statement;
	private Expression expression;

	public WhileStatement(final Location loc, Expression expression, List<Statement> statements)
	{
		super(loc);
		this.statement = statements.get(0);
		this.expression = expression;
	}

	public <T> T apply(TreeVisitor<T> visitor)
	{
		return visitor.visit(this);
	}

	public Statement getStatement() 
	{
		return this.statement;
	}

	public Expression getExpression() 
	{
		return this.expression;
	}
}