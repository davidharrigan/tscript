package ts.tree;

import java.util.List;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST block statement node
 *
 */
public final class BlockStatement extends Statement
{
	private List<Statement> statements;
	public BlockStatement(final Location loc, final List<Statement> statements)
	{
		super(loc);
		this.statements = statements;
	}

	public <T> T apply(TreeVisitor<T> visitor)
	{
		return visitor.visit(this);
	}

	public List<Statement> getStatements() 
	{
		return this.statements;
	}
}