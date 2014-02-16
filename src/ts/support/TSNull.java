
package ts.support;

public final class TSNull extends TSPrimitive 
{
	private final Object value;
	public static final TSNull nullValue = new TSNull(null); 

	private TSNull(final Object value) {
		this.value = value; 
	}

	public static TSNull create(final Object value) 
	{
		return nullValue;
	}

	/** Get the value */
	public Object getInternal() 
	{
		return value;
	}

	/** Convert to number */
	public TSNumber toNumber() 
	{
		return TSNumber.zeroValue;
	}

	/** Convert to boolean */
	public TSBoolean toBoolean() 
	{
		return TSBoolean.falseValue;
	}

	/** Conver to string */
	public TSString toStr() 
	{
		return TSString.create("null");
	}
}