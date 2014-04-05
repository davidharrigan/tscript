

package ts.support;

import ts.Message;

/**
 * The super class for all Tscript values.
 */
public abstract class TSValue
{
  //
  // References: i.e. getValue and putValue (section 8.7)
  //

  /** Get the value. This method is only overridden in TSReference.
   *  Otherwise just return "this".
   */
  public TSValue getValue()
  {
    return this;
  }

  /** Assign to the value. This method is only overridden in TSReference.
   *  Otherwise just report an error.
   */
  public void putValue(TSValue value)
  {
    Message.evaluationError("reference expected");
  }

  //
  // conversions (section 9)
  //

  /** Convert to Primitive. Override only in TSObject and TSReference.
   *  Otherwise just return "this". Note: type hint is not implemented.
   */
  TSPrimitive toPrimitive()
  {
    return (TSPrimitive) this;
  }

  abstract public TSNumber toNumber();
  abstract public TSBoolean toBoolean();

  /** Convert to String. Override for all primitive types and TSReference.
   *  It can't be called toString because of Object.toString.
   */
  public TSString toStr()
  {
    TSPrimitive prim = this.toPrimitive();
    return prim.toStr();
  }

  //
  //
  //
  public final TSBoolean not()
  {
    TSPrimitive leftValue = this.toPrimitive();
    if (leftValue.toNumber().getInternal() != 0)
      return TSBoolean.create(false);
    return TSBoolean.create(true);
  }

  public final TSNumber unaryMinus() 
  {
    TSPrimitive leftValue = this.toPrimitive();
    Double lv = leftValue.toNumber().getInternal();

    if (Double.isNaN(lv))
      return TSNumber.create(Double.NaN);
    if (lv == -0.0)
      return TSNumber.create(+0.0);
    if (lv == +0.0)
      return TSNumber.create(-0.0);

    return TSNumber.create(lv * -1.0);
  }

  //
  // binary operators (sections 11.5-11.11)
  //

  /** Perform a multiply. "this" is the left operand and the right
   *  operand is given by the parameter. Both operands are converted
   *  to Number before the multiply.
   */
  public final TSNumber multiply(final TSValue right)
  {
    TSPrimitive leftValue = this.toPrimitive();
    TSPrimitive rightValue = right.toPrimitive();
    Double ln = leftValue.toNumber().getInternal();
    Double rn = rightValue.toNumber().getInternal();

    if (Double.isNaN(ln) || Double.isNaN(rn))
      return TSNumber.create(Double.NaN);

    if (ln == Double.POSITIVE_INFINITY || ln == Double.NEGATIVE_INFINITY) 
    {
      if (rn == +0.0 || rn == -0.0 || rn == 0.0)
        return TSNumber.create(Double.NaN);
      
      if ((ln == Double.POSITIVE_INFINITY && rn == Double.POSITIVE_INFINITY) ||
           ln == Double.NEGATIVE_INFINITY && rn == Double.NEGATIVE_INFINITY) 
      {
        return TSNumber.create(Double.POSITIVE_INFINITY);
      }
      
      if (rn < 0 && ln == Double.POSITIVE_INFINITY)
        return TSNumber.create(Double.NEGATIVE_INFINITY);
      
      else
        return TSNumber.create(Double.POSITIVE_INFINITY);
    }

    return TSNumber.create(ln * rn);
  }
  
  /** Perform a division. "this" is the left operand and the right
   *  operand is given by the parameter. Both operands are converted
   *  to Number before the addition.
   */
  public final TSPrimitive divide(final TSValue right)
  {
    TSPrimitive leftValue = this.toPrimitive();
    TSPrimitive rightValue = right.toPrimitive();    
    Double ln = leftValue.toNumber().getInternal();
    Double rn = rightValue.toNumber().getInternal();

    if (Double.isNaN(ln) || Double.isNaN(rn))
      return TSNumber.create(Double.NaN);

    if (ln == Double.POSITIVE_INFINITY || ln == Double.NEGATIVE_INFINITY) 
    { 
      if (rn == Double.POSITIVE_INFINITY || rn == Double.NEGATIVE_INFINITY)
        return TSNumber.create(Double.NaN);
    
      if (rn == -0.0) {
        if (ln == Double.POSITIVE_INFINITY)
          return TSNumber.create(Double.NEGATIVE_INFINITY);
        else 
          return TSNumber.create(Double.POSITIVE_INFINITY);
      }

      if (rn == +0.0 || rn == 0.0) 
      {
        if (ln == Double.POSITIVE_INFINITY)
          return TSNumber.create(Double.POSITIVE_INFINITY);
        else
          return TSNumber.create(Double.NEGATIVE_INFINITY);
      }
    }

    if (rn == Double.POSITIVE_INFINITY || rn == Double.NEGATIVE_INFINITY)
    {
      if (ln < 0)
        return TSNumber.create(-0.0);
      if (ln > 0)
        return TSNumber.create(+0.0);
    }

    if (rn == -0.0)
    {
      if (ln == 0.0 || ln == -0.0 || ln == +0.0)
        return TSNumber.create(Double.NaN);
      if (ln > 0)
        return TSNumber.create(Double.NEGATIVE_INFINITY);
      return TSNumber.create(Double.POSITIVE_INFINITY);
    }

    if (rn == 0.0 || rn == +0.0) {
      if (ln == 0.0 || ln == -0.0 || ln == +0.0)
        return TSNumber.create(Double.NaN);
      if (ln > 0)
        return TSNumber.create(Double.POSITIVE_INFINITY);
      return TSNumber.create(Double.NEGATIVE_INFINITY);
    }

    return TSNumber.create(ln / rn);
  }

  /** Perform an addition. "this" is the left operand and the right
   *  operand is given by the parameter. Both operands are converted
   *  to Number before the addition.
   */
  public final TSPrimitive add(final TSValue right)
  {
    TSPrimitive leftValue = this.toPrimitive();
    TSPrimitive rightValue = right.toPrimitive();

    if (leftValue.getClass() == TSString.class || rightValue.getClass() == TSString.class)
    {
      return TSString.create(leftValue.toStr().getInternal() + 
        rightValue.toStr().getInternal());
    }  

    return TSNumber.create(leftValue.toNumber().getInternal() +
      rightValue.toNumber().getInternal());
  }
  
  /** Perform an subtraction. "this" is the left operand and the right
   *  operand is given by the parameter. Both operands are converted
   *  to Number before the addition.
   */
  public final TSPrimitive subtract(final TSValue right)
  {
    TSPrimitive leftValue = this.toPrimitive();
    TSPrimitive rightValue = right.toPrimitive();
    double ln = leftValue.toNumber().getInternal();
    double rn = -rightValue.toNumber().getInternal();

    if (Double.isNaN(ln) || Double.isNaN(rn))
      return TSNumber.create(Double.NaN);
    
    if (ln == Double.POSITIVE_INFINITY && rn == Double.NEGATIVE_INFINITY)
      return TSNumber.create(Double.NaN);
    
    if (ln == Double.NEGATIVE_INFINITY && rn == Double.POSITIVE_INFINITY)
      return TSNumber.create(Double.NaN);
    
    if (ln == Double.POSITIVE_INFINITY && rn == Double.POSITIVE_INFINITY)
      return TSNumber.create(Double.POSITIVE_INFINITY);
    
    if (ln == Double.NEGATIVE_INFINITY && rn == Double.NEGATIVE_INFINITY)
      return TSNumber.create(Double.NEGATIVE_INFINITY);

    if (ln == -0.0 && rn == -0.0)
      return TSNumber.create(-0.0);

    if ((ln == -0.0 || ln == +0.0) && (rn == -0.0 || rn == +0.0))
      return TSNumber.create(+0.0);

    if (ln == rn)
      return TSNumber.create(+0.0);

    return TSNumber.create(ln + rn);
  }

  /** Perform an assignment. "this" is the left operand and the right
   *  operand is given by the parameter.
   */
  public final TSValue simpleAssignment(final TSValue right)
  {
    TSValue rightValue = right.getValue();
    this.putValue(rightValue);
    return rightValue;
  }

  /** Perform an equal comparison. "this" is the left operand and the right 
   *  operand is given by the parameter.
   */
  public final TSBoolean isEqual(final TSValue right) 
  {
    boolean result = abstractEqualityComparison(this.toPrimitive(), right.toPrimitive());
    return TSBoolean.create(result);
  }

  /** Perform a less than comparison. "this" is the left operand and the right 
   *  operand is given by the parameter.
   */
  public final TSBoolean isLess(final TSValue right) 
  {
    TSPrimitive leftValue = this.toPrimitive();
    TSPrimitive rightValue = right.toPrimitive();

    return TSBoolean.create(abstractRelationalComparison(leftValue, rightValue, true));
  }

  /** Perform a greater than comparison. "this" is the left operand and the right 
   *  operand is given by the parameter.
   */
  public final TSBoolean isGreater(final TSValue right) 
  {
    TSPrimitive leftValue = this.toPrimitive();
    TSPrimitive rightValue = right.toPrimitive();

    return TSBoolean.create(abstractRelationalComparison(leftValue, rightValue, false));
  }


  //
  // test for null and undefined
  //

  /** Is this value Undefined? Override only in TSUndefined and
   *  TSReference.
   */
  public boolean isUndefined()
  {
    return false;
  }

  /** Perform an abstract relational comparison algorithm.
   *
   */
  private boolean abstractRelationalComparison(TSPrimitive left, 
    TSPrimitive right, boolean leftFirst)
  {
    TSPrimitive px, py;

    // Part 1
    if (leftFirst) {
      px = left;
      py = right;
    }

    // Part 2
    else {
      px = right;
      py = left; 
    }

    // Part 3
    if (!(px.getClass() == TSString.class) || !(px.getClass() == TSString.class)) 
    {
      double nx = px.toNumber().getInternal();
      double ny = py.toNumber().getInternal();

      if (Double.isNaN(nx) || Double.isNaN(ny))
        return false; 
      if (nx == ny)
        return false;
      if (nx == +0.0 && ny == -0.0)
        return false;
      if (nx == -0.0 && ny == +0.0)
        return false;
      if (nx == Double.POSITIVE_INFINITY)
        return false;
      if (ny == Double.POSITIVE_INFINITY)
        return true;
      if (ny == Double.NEGATIVE_INFINITY)
        return false;
      if (nx == Double.NEGATIVE_INFINITY)
        return true;
      if (nx < ny)
        return true;
      return false;
    }

    // Part 4
    else 
    {
      String sx = px.toStr().getInternal();
      String sy = py.toStr().getInternal();

      if (sx.startsWith(sy))
        return false; 
      else if (sy.startsWith(sx))
        return true;
      else if (sx.compareTo(sy) < 0)
        return true;
      return false;
    }
  } 

  /** Perform an abstract equality comparison. 
   * 
   */
  private boolean abstractEqualityComparison(TSPrimitive left, TSPrimitive right) {
    // Part 1
    if (left.getClass() == right.getClass())
    {
      if (left.isUndefined())
        return true; 
      if (left.getClass() == TSNull.class)
        return true;
      if (left.getClass() == TSNumber.class)
      {
        if (Double.isNaN(left.toNumber().getInternal()))
          return false;
        if (Double.isNaN(right.toNumber().getInternal()))
          return false;
        if (left.toNumber().getInternal() == right.toNumber().getInternal())
          return true;
        if (left.toNumber().getInternal() == +0.0 && right.toNumber().getInternal() == -0.0)
          return true;
        if (left.toNumber().getInternal() == -0.0 && right.toNumber().getInternal() == +0.0)
          return true;
      }
      if (left.getClass() == TSString.class) 
      {
        if (left.toStr().getInternal().equals(right.toStr().getInternal()))
          return true;
        return false;
      }
      if (left.getClass() == TSBoolean.class) {
        if (left.toBoolean().getInternal() == right.toBoolean().getInternal())
          return true;
        return false;
      }
    }

    // Part 2
    else if (left.getClass() == TSNull.class && right.getClass() == TSUndefined.class) 
    {
      return true;
    }

    // Part 3
    else if (left.getClass() == TSUndefined.class && right.getClass() == TSNull.class)
    {
      return true;
    }

    // Part 4
    else if (left.getClass() == TSNumber.class && right.getClass() == TSString.class)
    {
      return abstractEqualityComparison(left, right.toNumber());
    }

    // Part 5
    else if (left.getClass() == TSString.class && right.getClass() == TSNumber.class) 
    {
      return abstractEqualityComparison(left.toNumber(), right);
    }

    // Part 6
    else if (left.getClass() == TSBoolean.class) 
    {
      return abstractEqualityComparison(left.toNumber(), right);
    }

    // Part 7
    else if (right.getClass() == TSBoolean.class) 
    {
      return abstractEqualityComparison(left, right.toNumber());
    }

    // Part 8
    // else if ((left.getClass() == TSString.class) || left.getClass() == TSNumber.class) && 
    //           right.getClass() == TSObject.class)
    // return abstractEqualityComparison(left, right.toPrimitive());

    // Part 9 
    // else if ((right.getClass() == TSString.class) || right.getClass() == TSNumber.class) && 
    //           left.getClass() == TSObject.class)
    // return abstractEqualityComparison(left.toPrimitive(), right);

    return false;
  }

  // If this is not overrided, its not callable
  public TSCompletion call() {
    assert false : "should be overwritten";
    return TSCompletion.createNormalNull();
  }

  public boolean isCallable() {
    return false;
  }

  public boolean isPrimitive() {
    return false;
  }
}

