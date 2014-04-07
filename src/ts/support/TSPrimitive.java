
package ts.support;

/**
 * The super class for all Tscript primitive values.
 */
public abstract class TSPrimitive extends TSObject
{
	public boolean isPrimitive() {
		return true;
	}

	public TSPrimitive toPrimitive() {
		return this;
	}
}


