package ts.support;

public final class TSBoolean extends TSPrimitive  {

	/** pre-built value for true */
	public static final TSBoolean trueValue  = new TSBoolean(true);
	/** pre-built value for false */
	public static final TSBoolean falseValue = new TSBoolean(false);
	
	private final boolean value; 

	private TSBoolean(final boolean value) {
		this.value = value; 
	}

	/** Create a Boolean with the given value. */
	public static TSBoolean create(final boolean value) {
		if (value == false)
			return falseValue;
		return trueValue;
	}

	/** Get the value */
	public boolean getInternal() {
		return value;
	}

	/** Convert to a Number, either 1 or 0 */
	public TSNumber toNumber() 
	{
		if (value == false)
			return TSNumber.create(+0.0);
		return TSNumber.create(1.0);
	}

	/** Convert Boolean to String */
	public TSString toStr() 
	{
		if (value == false)
			return TSString.create("false");
		return TSString.create("true");
	}

	/** Convert to Boolean, so nothing to do */
	public TSBoolean toBoolean() 
	{
		return this;
	}
}