
package ts.support;

/**
 * Class to represent global object
 */
public class TSGlobalObject extends TSObject 
{
	private TSGlobalObject() 
	{
		super(null);
	}

	public static TSGlobalObject create() 
	{
		TSGlobalObject global = new TSGlobalObject();
		global.putProperty(TSString.create("NaN"), TSNumber.create(Double.NaN));
		global.putProperty(TSString.create("Infinity"), TSNumber.create(Double.POSITIVE_INFINITY));
		global.putProperty(TSString.create("undefined"), TSUndefined.value);
		return global;
	}
} 