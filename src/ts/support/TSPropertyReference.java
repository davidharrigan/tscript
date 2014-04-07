
package ts.support;


public class TSPropertyReference extends TSReference 
{
	private TSObject base;


	public TSPropertyReference(final TSString name, TSValue base) {
		super(name);
		this.base = (TSObject) base;
	}

	public TSObject getObjectBase() {
		return base;
	}

	public boolean isPropertyReference() {
		return true;
	}

	public boolean isUnresolvableReference() {
		return (base instanceof TSUndefined);
	}

	public TSValue getValue() {
		// might have to look at this again 
		// 8.7.1
		return base.getProperty(this.name);
	}

	public void putValue(TSValue value) {
		if (isUnresolvableReference()) {
			TSEnvironmentRecord.global.putProperty(this.getReferencedName(), 
				value);
		}
		else {
			base.putProperty(name, value);
		}
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