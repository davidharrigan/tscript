package ts.tree;

import java.util.List;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 *
 */
public final class IfStatement extends Statement
{
	private Expression expression;
	private Statement statement1, statement2;

	public IfStatement(final Location loc, final Expression expression, 
		final List<Statement> statement1, 
		final List<Statement> statement2) 
	{
		super(loc);
		this.expression = expression;
		this.statement1 = statement1.get(0);
		if (statement2 != null)
			this.statement2 = statement2.get(0); 
		else 
			this.statement2 = null;
	}

	public <T> T apply(TreeVisitor<T> visitor)
	{
		return visitor.visit(this);
	}

	public Expression getExpression() 
	{
		return this.expression;
	}

	public Statement getStatement1() 
	{
		return this.statement1;
	}

	public Statement getStatement2()
	{
		return this.statement2;
	}
}