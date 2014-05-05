package ts.support;

import java.util.List;
import java.util.Vector;

import ts.Message;

/** 
 * Class to represent array object
 */
public class TSArray extends TSObject
{
	private Vector<TSValue> list; 

	private TSArray() 
	{
		super();
		list = new Vector<TSValue>();
	}

	public static TSArray create() 
	{
		TSArray array = new TSArray();
		array.putProperty(TSString.create("push"), new Push());
		array.putProperty(TSString.create("toString"), new ToString());
		array.putProperty(TSString.create("length"), new Length());
		array.putProperty(TSString.create("slice"), new Slice());
		return array;
	}

	public void push(TSValue v) 
	{
		this.list.add(v);
	}

	public TSValue get(TSNumber elem) {
		int loc = (int) elem.getInternal();
		
		if (loc >= list.size() || loc < 0) {
			return TSUndefined.value;
		}

		return list.get(loc);
	}

	public TSString toStr() {
		StringBuffer result = new StringBuffer("[ ");
		for (TSValue elem: this.list) {
			result.append(elem.toStr().getInternal() + ", ");
		}

		try {
			result.replace(result.lastIndexOf(", "), result.length()-1, " ]");
		} 
		catch(StringIndexOutOfBoundsException e) {
			result.append("]");
		} 

		return TSString.create(result.toString());
	}

	/** 
	 * toString function
	 */
	static class ToString extends TSFunctionObject {
		public ToString() {
			super("toString", null, null, null);
		}

		public TSCompletion call(TSObject thisValue, List<TSValue> args) {
			if ( !(thisValue instanceof TSArray) ) {
				return TSCompletion.createNormal(TSBoolean.falseValue);
			}

			TSArray arr = (TSArray) thisValue;
			return TSCompletion.createNormal(arr.toStr());
		}
	}

	/**
	 * Push function 
	 */
	static class Push extends TSFunctionObject {
		public Push() {
			super("push", null, null, null);
		}

		public TSCompletion call(TSObject thisValue, List<TSValue> args) {
			if ( !(thisValue instanceof TSArray) || 
				  args.size() < 1 ) {
				return TSCompletion.createNormal(TSBoolean.falseValue);
			}

			TSArray arr = (TSArray) thisValue;
			for (TSValue v: args) {			
				arr.push(v);
			}
			return TSCompletion.createNormal(TSBoolean.trueValue);
		}
	}

	/**
	 * Length function
	 */
	static class Length extends TSFunctionObject {
		public Length() {
			super("length", null, null, null);
		}

		public TSCompletion call(TSObject thisValue, List<TSValue> args) {
			if ( !(thisValue instanceof TSArray) ) {
				return TSCompletion.createNormal(TSBoolean.falseValue);
			}

			TSArray arr = (TSArray) thisValue;
			TSNumber result = TSNumber.create(arr.list.size());
			return TSCompletion.createNormal(result);
		}
	}

	/**
	 * slice function
	 * TODO: need to array index out of bounds
	 */
	static class Slice extends TSFunctionObject {
		public Slice() {
			super("slice", null, null, null);
		}

		public TSCompletion call(TSObject thisValue, List<TSValue> args) {
			if ( !(thisValue instanceof TSArray) ||
				 args.size() < 1) {
				return TSCompletion.createNormal(TSBoolean.falseValue);
			}

			TSArray arr = (TSArray) thisValue;
			int start = (int) args.get(0).toNumber().getInternal();
			int end = (args.size() > 1) ?
				(int) args.get(1).toNumber().getInternal() : arr.list.size(); 	

			start = (start < 0) ? arr.list.size() - start : start;
			end = (end < 0) ? arr.list.size() - end : end;

			TSArray ret = TSArray.create();
			for (int i=start; i<end; i++) {
				ret.push(arr.list.get(i));
			}
			return TSCompletion.createNormal(ret);
		}
	}
}