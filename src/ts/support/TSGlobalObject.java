
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
        global.putProperty(TSString.create("substring"), new Substring());
        global.putProperty(TSString.create("indexOf"), new IndexOf());
        global.putProperty(TSString.create("length"), new Length());
        global.putProperty(TSString.create("split"), new Split());
		return global;
	}

    /**
     * Global object built-in isNaN function
     */
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

    /**
     * Global object built-in isFinite function
     */
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

    /** 
     * Global object built-in readln function which reads from stdin
     */ 
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

    /** 
     * Global object built-in function that tests prototype
     * inheritance
     */
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

    /**
     * Built-in substring function
     */
    static class Substring extends TSFunctionObject {

        public Substring() {
            super("substring", null, null, null);
        }

        public TSCompletion call(TSObject thisValue, List<TSValue> args) {
            if (args.size() < 2) {
                return TSCompletion.createNormal(TSString.create(""));
            }
            
            String str   = args.get(0).toStr().getInternal(); int start = (int)args.get(1).toNumber().getInternal();
            int end;
            start = (start < 0) ? 0 : start;
            if (args.size() > 2) {
                end = (int)args.get(2).toNumber().getInternal();
                if (end > str.length() || end < start) {
                    end = str.length();
                }
            }
            else { 
                end = str.length();
            }

            String result = str.substring(start, end);
            return TSCompletion.createNormal(TSString.create(result));
        }
    }

    /**
     * Built-in string indexOf function
     */
    static class IndexOf extends TSFunctionObject {
        
        public IndexOf() {
            super("indexOf", null, null, null);
        }

        public TSCompletion call(TSValue thisValue, List<TSValue> args) {
            if (args.size() < 2) {
                return TSCompletion.createNormal(TSNumber.create(-1));
            }

            String str = args.get(0).toStr().getInternal();
            String sub = args.get(1).toStr().getInternal();
            int result = str.indexOf(sub);
            return TSCompletion.createNormal(TSNumber.create(result));
        }
    }

    /**
     * Built-in string length function
     */
    static class Length extends TSFunctionObject {
        
        public Length() {
            super("length", null, null, null); 
        }

        public TSCompletion call(TSObject thisValue, List<TSValue> args) {
            if (args.size() < 1) {
                return TSCompletion.createNormal(TSNumber.create(0));
            }

            String str = args.get(0).toStr().getInternal();
            int result = str.length();
            return TSCompletion.createNormal(TSNumber.create(result));
        }
    }

    /** 
     * Built-in string split function
     */
    static class Split extends TSFunctionObject {
    	public Split() {
    		super("split", null, null, null);
    	}

    	public TSCompletion call(TSObject thisValue, List<TSValue> args) {
    		if (args.size() < 1) {
    			return TSCompletion.createNormal(TSUndefined.value);
    		}

    		String str = args.get(0).toStr().getInternal();
    		TSArray result = TSArray.create();
    		
    		if (args.size() == 1) {
    			result.push(TSString.create(str));
    		}
    		else {
    			String regex = args.get(1).toStr().getInternal();
    			String[] split;

    			if (args.size() > 2) {
    				int limit = (int) args.get(2).toNumber().getInternal();
    				split = str.split(regex, limit);
    			} 
    			else {
    				split = str.split(regex);
    			}

    			for (String s: split) {
    				result.push(TSString.create(s));
    			}
    		}
    		return TSCompletion.createNormal(result);
    	}
    }
} 
