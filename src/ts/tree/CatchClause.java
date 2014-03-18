
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;
import ts.support.TSValue;

/**
 * AST Catch Clause node
 *
 */
public class CatchClause extends Expression
{
	private String name;
	private Statement block;
	private TSValue param;

	public CatchClause(final Location loc, final String name, 
		final Statement block)
	{
		super(loc);
		this.name = name;
		this.block = block;
	}

	public void passParameter(TSValue param)
	{
		this.param = param;
	}

	public Statement getStatement()
	{
		return this.block;
	}

	public String getName() 
	{
		return this.name;
	}

	public TSValue getParam()
	{
		return this.param;
	}

	public <T> T apply(TreeVisitor<T> visitor)
	{
		return visitor.visit(this);
	}
}