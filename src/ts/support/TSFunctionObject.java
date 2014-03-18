
package ts.support;

import ts.tree.*;
import ts.tree.visit.*;
import ts.Message;

import java.util.List;

public final class TSFunctionObject extends TSObject
{
	private final String name;
	private final List<Statement>  body;
	private final TSLexicalEnvironment funcEnv;

	private TSFunctionObject(String name, List<Statement> body,
		TSLexicalEnvironment oldEnv)
	{
		this.name = name;
		this.body = body;
		this.funcEnv = TSLexicalEnvironment.newDeclarativeEnvironment(oldEnv);

		if (name != null)
			this.funcEnv.declareFunctionName(name, this);
	}

	public static TSFunctionObject create(String name, List<Statement> body, 
		TSLexicalEnvironment oldEnv)
	{
		return new TSFunctionObject(name, body, oldEnv);
	}

	public TSCompletion call() 
	{
		System.out.println("call");
		TSCompletion completion = TSCompletion.createNormalNull();
		TreeEvaluate treeEval = new TreeEvaluate(this.funcEnv);
	    for (Object item : body)
	    {
	    	Tree t = (Tree) item;
	        completion = t.apply(treeEval);
	        if (!completion.isNormal())
	        {
	          	Message.fatal("evaluation completed abnormally!");
	        }
	    }
	    return completion;
	}

	public String getName() {
		return this.name;
	}

	public TSNumber toNumber() 
	{
		return TSNumber.create(1);	
	}

	public TSBoolean toBoolean() 
	{
		return TSBoolean.create(true);
	}
}
