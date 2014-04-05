
package ts.support;

import ts.tree.*;
import ts.tree.visit.*;
import ts.Message;

import java.util.List;
/**
 * Class to represent function objets. 
 * <a href="http://www.ecma-international.org/ecma-262/5.1/#sec-13.2">ELS 13.2</a>
 * 
 */
public final class TSFunctionObject extends TSObject
{
	private final String name;
	private final List<Statement>  code;
	private final TSLexicalEnvironment scope;

	private TSFunctionObject(String name, List<Statement> code,
		TSLexicalEnvironment scope)
	{
		super(null);
		this.name = name;
		this.code = code;
		this.scope = scope;
	}

	public static TSFunctionObject create(String name, List<Statement> body, 
		TSLexicalEnvironment oldEnv)
	{
		return new TSFunctionObject(name, body, oldEnv);
	}

	/**
	 * Function call method
	 * <a href="http://www.ecma-international.org/ecma-262/5.1/#sec-13.2.1">ELS 13.2.1</a>
	 */
	public final TSCompletion call() 
	{
		TSLexicalEnvironment localEnv = TSLexicalEnvironment.newDeclarativeEnvironment(scope);

		TreeEvaluate treeEval = new TreeEvaluate(localEnv);
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
}
