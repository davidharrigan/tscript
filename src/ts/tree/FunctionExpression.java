package ts.tree;

import java.util.List;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST Function expression node
 *
 */
public final class FunctionExpression extends Expression
{
	private String name;
	private List<Statement> body;

	public FunctionExpression(final Location loc, final String name, final List<Statement> body) 
	{
		super(loc);
		this.name = name;
		this.body = body;
	}

	public String getName() 
	{
		return this.name;
	}

	public List<Statement> getBody() 
	{
		return this.body;
	}

	public <T> T apply(TreeVisitor<T> visitor)
	{
		return visitor.visit(this);
	}
}	