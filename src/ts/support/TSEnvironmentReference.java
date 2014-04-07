package ts.support;

import ts.Message;

/**
 * The class for Tscript References for lexical environment references
 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-8.7">ELS
 * 8.7</a>).
 *
 */
final class TSEnvironmentReference extends TSReference
{
  private TSEnvironmentRecord base;

  /** Create a Reference for a name in an environment. */
  TSEnvironmentReference(final TSString name, final TSEnvironmentRecord base)
  {
    super(name);
    this.base = base;
  }

  public TSEnvironmentRecord getRecordBase() {
    return base;
  }

  /** Is the reference not resolvable? That is, is the name not defined
   *  in the environment?
   */
  public boolean isUnresolvableReference() {
    return (base == null);
  }

  /** Environment references cannot be property references so this always
   *  returns false.
   */
  public boolean isPropertyReference()
  {
    return false;
  }

  /** Get the value from the Reference. Issues an error and
   *  returns null if the name is not defined.
   */
  public TSValue getValue() {
    return base.getBindingValue(this.getReferencedName());
  }

  /** Assign a value to the name specified by the Reference. */
  public void putValue(final TSValue value)
  {
    if (isUnresolvableReference()) {
      TSEnvironmentRecord.global.putProperty(this.getReferencedName(), value);
    }
    else {
      base.setMutableBinding(this.getReferencedName(), value);
    }
  }

}

