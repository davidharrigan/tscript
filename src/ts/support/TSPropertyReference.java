
package ts.support;


public class TSPropertyReference extends TSReference 
{
	private TSObject base;


	public TSPropertyReference(final TSString name, TSValue base) {
		super(name);
		this.base = (TSObject) base;
	}

	public boolean isPropertyReference() {
		return true;
	}

	public boolean isUnresolvableReference() {
		return false;
	}

	public TSValue getBase() {
		return base;
	}

	public TSValue getValue() {
		return base.getProperty(this.name);
	}

	// pass global in later
	public void putValue(TSValue value) {
		base.putProperty(name, value);
	}


	protected TSPrimitive getPrimitive()
	{
		return this.getValue().toPrimitive();
	}

	public final TSNumber toNumber()
	{
		return this.getValue().toNumber();
	}
}