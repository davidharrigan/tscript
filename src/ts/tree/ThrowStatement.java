
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST throw node
 *
 */
public class ThrowStatement extends Statement
{
	private Expression expression;

	public ThrowStatement(final Location loc, final Expression expression)
	{
		super(loc);
		this.expression = expression;
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