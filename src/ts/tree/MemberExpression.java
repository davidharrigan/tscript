package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

import java.util.List;
import java.util.ArrayList;

/**
 * AST Member expression node
 *
 */
public final class MemberExpression extends Expression
{
	private Expression expression;
	private Arguments arguments;

	public MemberExpression(final Location loc, final Expression expression,
		final Arguments arguments)
	{  
		super(loc);
		this.expression = expression;
		this.arguments = arguments;
	}

	public Expression getExpression()
	{
		return this.expression;
	}

	public List<Expression> getArguments() 
	{
		if (arguments == null) {
			return new ArrayList<Expression>();
		}
		return this.arguments.getArgumentList();
	}

	public <T> T apply(TreeVisitor<T> visitor) 
	{
		return visitor.visit(this);
	}
}