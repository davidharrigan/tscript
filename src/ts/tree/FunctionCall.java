package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

import java.util.List;
import java.util.ArrayList;
/**
 * AST Function call node
 *
 */
public final class FunctionCall extends Expression
{
	private Expression funcExpression;
	private Arguments args;

	public FunctionCall(final Location loc, final Expression expression,
		final Arguments args)
	{
		super(loc);
		this.funcExpression = expression;
		this.args = args;
	}

	public Expression getExpression() 
	{
		return this.funcExpression;
	}

	public List<Expression> getArguments() 
	{
		if (args == null) {
			return new ArrayList<Expression>();
		}
		return this.args.getArgumentList();
	}

	public <T> T apply(TreeVisitor<T> visitor)	
	{
		return visitor.visit(this);
	}
}