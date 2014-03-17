package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST Break statement node
 *
 */
public final class BreakStatement extends Statement 
{
	private String name;

	public BreakStatement(final Location loc, final String name)
	{
		super(loc);
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}

	public <T> T apply(TreeVisitor<T> visitor)
	{
		return visitor.visit(this);
	}
}