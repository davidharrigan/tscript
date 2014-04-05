package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST New expression node
 *
 */
public final class NewExpression extends Expression
{
	private Expression expression;
	private boolean isMember;

	public NewExpression(final Location loc, final Expression expression, 
		final boolean isMember)
	{  
		super(loc);
		this.expression = expression;
	}

	public Expression getExpression()
	{
		return this.expression;
	}

	public boolean isMember() {
		return isMember;
	}

	public <T> T apply(TreeVisitor<T> visitor) 
	{
		return visitor.visit(this);
	}
}