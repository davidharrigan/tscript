
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST Finally Clause
 *
 */
public class FinallyClause extends Expression
{
	private Statement block;

	public FinallyClause(final Location loc, final Statement block)
	{
		super(loc);
		this.block = block;
	}

	public Statement getStatement() 
	{
		return this.block;
	}

	public <T> T apply(TreeVisitor<T> visitor)
	{
		return visitor.visit(this);
	}
}