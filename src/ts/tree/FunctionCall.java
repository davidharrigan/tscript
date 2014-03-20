package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST Function call node
 *
 */
public final class FunctionCall extends Expression
{
	private Expression funcExpression;

	public FunctionCall(final Location loc, final Expression expression)
	{
		super(loc);
		this.funcExpression = expression;
	}

	public Expression getExpression() 
	{
		return this.funcExpression;
	}

	public <T> T apply(TreeVisitor<T> visitor)	
	{
		return visitor.visit(this);
	}
}