package ts.tree;

import java.util.List;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST Labelled statment node
 *
 */
public final class LabelledStatement extends Statement 
{
	private String name;
	private Statement statement;

	public LabelledStatement(final Location loc, final String name, 
		final List<Statement> statements)
	{
		super(loc);
		this.name = name;
		this.statement = statements.get(0);
	}

	public String getName() 
	{
		return this.name;
	}

	public Statement getStatement() 
	{
		return this.statement;
	}

	public <T> T apply(TreeVisitor<T> visitor)
	{
		return visitor.visit(this);
	}
}