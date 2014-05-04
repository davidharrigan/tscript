
package ts.tree;

import java.util.List;
import java.util.ArrayList;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST array literal leaf node
 *
 */
public final class ArrayLiteral extends Expression 
{
	private List<Expression> elements;

	public ArrayLiteral(final Location loc, 
		final List<Expression> elements)
	{
		super(loc);
		if (elements == null) {
			this.elements = new ArrayList<Expression>();
		} 
		else {
			this.elements = elements;
		}
	} 

	public List<Expression> getElements() 
	{
		return this.elements;
	}

	public <T> T apply(TreeVisitor<T> visitor)
	{
		return visitor.visit(this);
	}
}