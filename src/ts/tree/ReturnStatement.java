
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST Return statement node
 *
 */
public final class ReturnStatement extends Statement
{
	private Expression expression;

	public ReturnStatement(final Location loc, final Expression exp)
	{
		super(loc);
		this.expression = exp;
	}

	public Expression getExpression()
	{
		return this.expression;
	}

	public <T> T apply(TreeVisitor<T> visitor)
	{
		return visitor.visit(this);
	}
}