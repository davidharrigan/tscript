
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST binary operator node
 *
 */
public class UnaryOperator extends Expression
{
  private Uop op;
  private Expression left;

  public UnaryOperator(final Location loc, final Uop op,
     final Expression left)
  {
    super(loc);
    this.op = op;
    this.left = left;
  }

  public Uop getOp()
  {
    return op;
  }

  /** Convert operator kind to (Java) String for displaying. */
  public String getOpString()
  {
    return op.toString();
  }

  public Expression getLeft()
  {
    return left;
  }

  public <T> T apply(TreeVisitor<T> visitor)
  {
    return visitor.visit(this);
  }
}

