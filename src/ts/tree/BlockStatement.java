package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST block statement node
 *
 */
public final class BlockStatement extends Statement
{
	public BlockStatement(final Location loc)
	{
		super(loc);
	}

	public <T> T apply(TreeVisitor<T> visitor)
	{
		return visitor.visit(this);
	}

}