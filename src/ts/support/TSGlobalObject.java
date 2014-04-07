
package ts.support;

import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import ts.Message;

/**
 * Class to represent global object
 */
public class TSGlobalObject extends TSObject 
{
	private static BufferedReader in;

	private TSGlobalObject() 
	{
		super();
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	public static TSGlobalObject create() 
	{
		TSGlobalObject global = new TSGlobalObject();
		global.putProperty(TSString.create("NaN"), TSNumber.create(Double.NaN));
		global.putProperty(TSString.create("Infinity"), TSNumber.create(Double.POSITIVE_INFINITY));
		global.putProperty(TSString.create("undefined"), TSUndefined.value);
		global.putProperty(TSString.create("isNaN"), new GOisNaN());
		global.putProperty(TSString.create("isFinite"), new GOisFinite());
		global.putProperty(TSString.create("readln"), new GOreadln());
		global.putProperty(TSString.create("testThis"), new GOtestThis());
		return global;
	}

	static class GOisNaN extends TSFunctionObject {
		public GOisNaN() {
			super("isNaN", null, null, null);
		}
		
		public TSCompletion call(TSObject thisValue, List<TSValue> args) {
			if (args.size() == 0) {
				return TSCompletion.createNormal(TSUndefined.value);
			}
			boolean result = Double.isNaN(args.get(0).toNumber().getInternal());
			return TSCompletion.createNormal(TSBoolean.create(result));
		}
	}

	static class GOisFinite extends TSFunctionObject {
		public GOisFinite() {
			super("isFinite", null, null, null);
		}

		public TSCompletion call(TSObject thisValue, List<TSValue> args) {
			if (args.size() == 0 ) {
				return TSCompletion.createNormal(TSUndefined.value);
			}
			Double val = args.get(0).toNumber().getInternal();
			boolean result = !Double.isInfinite(val);
			return TSCompletion.createNormal(TSBoolean.create(result));
		}
	}

	static class GOreadln extends TSFunctionObject {
		public GOreadln() {
			super("readln", null, null, null);
		}

		public TSCompletion call(TSObject thisValue, List<TSValue> args) {
			try {
				String line = in.readLine();

				if (line == null) {
					line = "";
				}
				else {
					line += "\n";
				}
				return TSCompletion.createNormal(TSString.create(line));
			} catch (IOException ioe) {
				Message.evaluationError("I/O exception in readln");
			}
			return TSCompletion.createNormal(TSUndefined.value);
		}
	}

	static class GOtestThis extends TSFunctionObject {
		public GOtestThis() {
			super("testThis", null, null, null);
			this.prototype = TSObject.create();
			this.prototype.putProperty(TSString.create("printXYZ"), new PrintXYZ());
		}

		public TSCompletion call(TSObject thisValue, List<TSValue> args) {
			TSString name = TSString.create("xyz");
			TSNumber value = TSNumber.create(42);
			thisValue.putProperty(name, value);
			return TSCompletion.createNormal(thisValue);
		}

		static class PrintXYZ extends TSFunctionObject{
			public PrintXYZ() {
				super("printXYZ", null, null, null);
			}

			public TSCompletion call(TSObject thisValue, List<TSValue> args) {
				TSString name = TSString.create("xyz");
				System.out.println(thisValue.getProperty(name).toStr().getInternal());
				return TSCompletion.createNormal(thisValue);
			}
		}
	}
} 