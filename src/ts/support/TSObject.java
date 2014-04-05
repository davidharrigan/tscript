
package ts.support;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Class to represent objects
 *
 */ 
public class TSObject extends TSValue
{
	private final Map<TSString, TSValue> properties; 
	private TSObject prototype = null;

	private static final TSString TOSTRING = TSString.create("toString");
	private static final TSString VALUEOF  = TSString.create("valueOf");

	/** Create a TSObject, initialize the HashMap to store and retrieve 
 	 *  properties
	 *
	 */
	protected TSObject(TSObject prototype) 
	{
		this.properties = new HashMap<TSString, TSValue>();
		this.prototype = prototype;
	}

	public static TSObject create() 
	{
		return new TSObject(null);
	}

	public static TSObject create(TSObject prototype)
	{
		return new TSObject(prototype);
	}

	public void putProperty(TSString name, TSValue value)
	{
		properties.put(name, value);
	}

	public TSValue getProperty(TSString name)
	{
		TSValue ret = properties.get(name);
		if (ret == null) {
			if (prototype != null) {
				return prototype.getProperty(name);
			}
			ret = TSUndefined.value;
		}
		return ret;
	}

	private TSValue getDefaultValue(int hint) 
	{
		if (hint == 0) { //String
			TSValue toString = getProperty(TOSTRING);
			if (toString.isCallable()) {
				TSValue str = toString.call().getValue();
				if (str.isPrimitive()) {
					return str;
				}
			}
			TSValue valueOf = getProperty(VALUEOF);
			if (valueOf.isCallable()) {
				TSValue val = valueOf.call().getValue();
				if (val.isPrimitive()) {
					return val;
				}
			}
			
		} else {
			TSValue valueOf = getProperty(VALUEOF);
			if (valueOf.isCallable()) {
				TSValue val = valueOf.call().getValue();
				if (val.isPrimitive()) {
					return val;
				}
			}
			TSValue toString = getProperty(TOSTRING);
			if (toString.isCallable()) {
				TSValue str = valueOf.call().getValue();
				if (str.isPrimitive()) {
					return str;
				}
			}
			
		}
		System.out.println("TypeError in get DefaultValue");
		return TSUndefined.value;
	}	

	TSPrimitive toPrimitive() 
	{
		return getDefaultValue(1).toPrimitive();
	}

	public TSNumber toNumber() 
	{
		return getDefaultValue(1).toNumber();
	}

	public TSString toStr() 
	{
		return getDefaultValue(0).toStr();
	}

	public TSBoolean toBoolean() 
	{
		return TSBoolean.create(true);
	}
}