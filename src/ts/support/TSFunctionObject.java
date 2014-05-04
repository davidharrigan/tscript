
package ts.support;

import ts.tree.*;
import ts.tree.visit.*;
import ts.Message;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;

/**
 * Class to represent function objets. 
 * <a href="http://www.ecma-international.org/ecma-262/5.1/#sec-13.2">ELS 13.2</a>
 * 
 */
public class TSFunctionObject extends TSObject
{
	private final String name;
	private final List<Statement>  code;
	private final List<String> paramterList;
	private final TSLexicalEnvironment scope;

	protected TSFunctionObject(String name, List<Statement> code,
		List<String> paramterList, TSLexicalEnvironment scope)
	{
		super(null);
		this.name = name;
		this.code = code;
		this.scope = scope;
		if (paramterList == null)
			this.paramterList = new ArrayList<String>();
		else 
			this.paramterList = paramterList;
	}

	public static TSFunctionObject create(String name, List<Statement> body, 
		List<String> paramterList, TSLexicalEnvironment oldEnv)
	{
		return new TSFunctionObject(name, body, paramterList, oldEnv);
	}

	public TSCompletion call()
	{
		return call(TSUndefined.value, new ArrayList<TSValue>());
	}

	/**
	 * Function call method
	 * <a href="http://www.ecma-international.org/ecma-262/5.1/#sec-13.2.1">ELS 13.2.1</a>
	 */
	public TSCompletion call(TSObject thisArg, List<TSValue> args) 
	{
		TSObject thisBinding;
		TSLexicalEnvironment localEnv = TSLexicalEnvironment.newDeclarativeEnvironment(scope);
		if (args == null) {
			args = new ArrayList<TSValue>();
		}
		
		if (thisArg == null || 
			thisArg instanceof TSUndefined || 
			thisArg instanceof TSNull) 
		{
			thisBinding = TSEnvironmentRecord.global;
		} 
		else {
			thisBinding = thisArg;
		}


		for (int i=0; i<paramterList.size(); i++) {
			TSValue v;
			String argName = paramterList.get(i);
			if (i >= args.size()) {
				v = TSUndefined.value;
			}
			else {
				v = args.get(i);
			}

			if (!localEnv.hasBinding(argName)) {
				localEnv.createMutableBinding(argName);
			}
			localEnv.setMutableBinding(argName, v);
		}

		TreeEvaluate treeEval = new TreeEvaluate(localEnv, thisBinding);
	    for (Object item : this.code)
	    {
	    	Tree t = (Tree) item;
	    	TSCompletion completion;
	        completion = t.apply(treeEval);
	        if (!completion.isNormal())
	        {
	        	if (completion.getType() == TSCompletionType.Return)
	        		return TSCompletion.create(TSCompletionType.Normal,
	        			completion.getValue(),
	        			completion.getTarget());
	        	return completion;
	        }
	    }
	    return TSCompletion.createNormal(TSUndefined.value);
	}

	public final TSString toStr() 
	{
		return TSString.create("function " + name);
	}

	public final boolean isCallable() {
		return true;
	}

	public final String getName() {
		return this.name;
	}

	public TSObject construct() {
		return construct(null);
	}

	public TSObject construct(List<TSValue> values) {
		TSObject obj = TSObject.create();
		TSValue proto = getProperty(TSString.create("prototype"));
		if (proto instanceof TSObject) {
			obj.putProperty(TSString.create("prototype"), proto);
		}

		Iterator it = properties.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry)it.next();
			obj.putProperty((TSString)pairs.getKey(), (TSValue)pairs.getValue());
			System.out.println(((TSString)pairs.getKey()).getInternal());
		}

		TSValue result = call(obj, values).getValue();
		if (result instanceof TSObject) {
			return (TSObject) result;
		}
		return obj;
	}
}
