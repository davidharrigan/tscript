package ts.tree;

import ts.support.TSFunctionObject;

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
	private List<String> parameterList;

	public FunctionExpression(final Location loc, final String name, 
		final List<Statement> body, final List<String> parameterList) 
	{
		super(loc);
		this.name = name;
		this.body = body;
		this.parameterList = parameterList; 
	}

	public String getName() 
	{
		return this.name;
	}

	public List<Statement> getBody() 
	{
		return this.body;
	}

	public List<String> getParameterList() 
	{
		return this.parameterList;
	}

	public <T> T apply(TreeVisitor<T> visitor)
	{
		return visitor.visit(this);
	}
}	