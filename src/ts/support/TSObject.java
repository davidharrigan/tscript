
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
	protected TSObject prototype = null;

	private static final TSString TOSTRING = TSString.create("toString");
	private static final TSString VALUEOF  = TSString.create("valueOf");

	/** Create a TSObject, initialize the HashMap to store and retrieve 
 	 *  properties
	 *
	 */
	protected TSObject()
	{
		this.prototype = null;
		this.properties = new HashMap<TSString, TSValue>();
	}

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
		if (name.getInternal().equals("prototype")) {
			if (value instanceof TSObject) {
				prototype = (TSObject)value;
			}
		} 
		else { 
			properties.put(name, value);
		}
	}

	public boolean hasProperty(TSString name)
	{
		if (properties.get(name) != null){
			return true;
		}
		if (prototype != null){
			return prototype.hasProperty(name);
		}
		return false;
	}

	public TSValue getProperty(TSString name)
	{
		if (name.getInternal().equals("prototype")) {
			return prototype;
		}

		TSValue ret = properties.get(name);
		if (ret == null) {
			if (prototype != null) {
				return prototype.getProperty(name);
			}
			ret = TSUndefined.value;
		}
		return ret;
	}

	public boolean deleteProperty(TSString name)
	{
		return (properties.remove(name) != null);
	}

	private TSValue getDefaultValue(int hint) 
	{
		if (hint == 0) { //String
			TSValue toString = getProperty(TOSTRING);
			if (toString.isCallable()) {
				TSValue str = toString.call(this, null).getValue();
				if (str.isPrimitive()) {
					return str;
				}
			}
			TSValue valueOf = getProperty(VALUEOF);
			if (valueOf.isCallable()) {
				TSValue val = valueOf.call(this, null).getValue(); 
				if (val.isPrimitive()) {
					return val;
				}
			}
			
		} else {
			TSValue valueOf = getProperty(VALUEOF);
			if (valueOf.isCallable()) {
				TSValue val = valueOf.call(this, null).getValue();
				
				if (val.isPrimitive()) {
					return val;
				}
			}
			TSValue toString = getProperty(TOSTRING);
			if (toString.isCallable()) {
				TSValue str = valueOf.call(this, null).getValue();
				if (str.isPrimitive()) {
					return str;
				}
			}
			
		}
		//System.out.println("TypeError in get DefaultValue");
		return TSUndefined.value;
	}	

	TSPrimitive toPrimitive() 
	{
		TSValue primVal = getDefaultValue(1);
		return primVal.toPrimitive();
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


	public TSObject construct() {
		return construct(null);
	}

	public TSObject construct(List<TSValue> values) {
		TSValue value = null;
		if (values != null && values.size() > 0) {
			value = values.get(0);
		}

		if (value != null) {
			return (TSObject) value;
		}

		assert !(value instanceof TSUndefined) || !(value instanceof TSNull) : 
			"Can't construct from undefined or null";

		if (prototype != null) {
			return TSObject.create(prototype);
		}
		return TSObject.create();
	}
	/*
	public TSCompletion call(TSObject thisArg, List<TSValue> args)
	{
		TSValue value = null;
		if (values != null && values.size() > 0) {
			value = values.get(0);
		}

		if (value == null || value instanceof TSUndefined || value instanceof TSNull) {
			return construct(args);
		}

		return new TSObject();
	}*/
}