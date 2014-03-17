package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST Continue statement node
 *
 */
public final class ContinueStatement extends Statement 
{
	private String name;

	public ContinueStatement(final Location loc, final String name)
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