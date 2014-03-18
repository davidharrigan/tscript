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
	private List<Statement> statements = null;
	private Statement statement = null;

	public BlockStatement(final Location loc, final List<Statement> statements)
	{
		super(loc);

		if (statements != null) {
			this.statement = statements.remove(statements.size()-1);
			this.statements = statements;
		}
	}

	public <T> T apply(TreeVisitor<T> visitor)
	{
		return visitor.visit(this);
	}

	public List<Statement> getStatements() 
	{
		return this.statements;
	}

	public Statement getStatement() 
	{
		return this.statement;
	}
}