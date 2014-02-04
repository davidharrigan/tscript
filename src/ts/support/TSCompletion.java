package ts.support;

/**
 * Class to represent the completion type 
 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-8.9">ELS
 * 8.9</a>).
 *
 */
public final class TSCompletion
{
  private TSCompletionType type;
  private TSValue value;
  private TSString target;

  private TSCompletion(final TSCompletionType type, final TSValue value,
    final TSString target)
  {
    this.type = type;
    this.value = value;
    this.target = target;
  }

  /** Create a completion type from its three components. */
  public static TSCompletion create(final TSCompletionType type,
    final TSValue value, final TSString target)
  {
    return new TSCompletion(type, value, target);
  }

  /** Create a normal completion type from its value. */
  public static TSCompletion createNormal(final TSValue value)
  {
    return new TSCompletion(TSCompletionType.Normal, value, null);
  }

  private static TSCompletion normalNull = createNormal(null);

  /** Create a normal completion type with a null value. */
  public static TSCompletion createNormalNull()
  {
    return normalNull;
  }

  public TSCompletionType getType()
  {
    return type;
  }

  public void setType(TSCompletionType type)
  {
    this.type = type;
  }

  public TSValue getValue()
  {
    return value;
  }

  public void setValue(TSValue value)
  {
    this.value = value;
  }

  public TSValue getTarget()
  {
    return target;
  }

  public void setTarget(TSString target)
  {
    this.target = target;
  }

  public boolean isNormal()
  {
    return (type == TSCompletionType.Normal);
  }

}


