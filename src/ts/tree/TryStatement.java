
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST Try Statement node
 *
 */
public class TryStatement extends Statement
{
	private Statement block;
	private Expression catchClause;
	private Expression finallyClause;

	public TryStatement(final Location loc, final Statement block, 
		final Expression catchClause, final Expression finallyClause)
	{
		super(loc);
		this.block = block;
		this.catchClause = catchClause;
		this.finallyClause = finallyClause;
	}

	public Statement getStatement() 
	{
		return this.block;
	}

	public CatchClause getCatchClause()
	{
		return (CatchClause)this.catchClause;
	}

	public Expression getFinallyClause()
	{
		return this.finallyClause;
	}

	public <T> T apply(TreeVisitor<T> visitor)
	{
		return visitor.visit(this);
	}
}