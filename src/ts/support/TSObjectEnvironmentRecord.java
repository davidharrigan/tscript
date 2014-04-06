
package ts.support;

import java.util.Map;
import java.util.HashMap;

final class TSObjectEnvironmentRecord extends TSEnvironmentRecord
{
	private final TSObject bindingObject;
	private final Map<TSString, TSBinding> map;

	/** Create a object environment record by creating a HashMap to
	 *  to connect names to their bindings
	 *  
	 *  @see TSBinding
	 */
	TSObjectEnvironmentRecord(TSObject bindingObject)
	{
		map = new HashMap<TSString, TSBinding>(10);
		this.bindingObject = bindingObject; 
	}

	/** Does the environment have a binding for the given name? */
  	boolean hasBinding(final TSString name)
 	{
 		return bindingObject.hasProperty(name);
 	}

 	/** Create a mutable binding for a name. Note that there is no value
     *  in the binding at this point.
     */
  	void createMutableBinding(final TSString name, final boolean isDeletable)
  	{
    	assert(bindingObject.hasProperty(name) == true) : "binding already exists";
    	bindingObject.putProperty(name, TSUndefined.value);
  	}

  	/** Connect a value to a mutable binding for a name. Note that the binding
   	 *  must already exist.
   	 */
  	void setMutableBinding(final TSString name, final TSValue value)
  	{
  		bindingObject.putProperty(name, value);
  	}


  	/** Get the value from a binding for a name. */
  	TSValue getBindingValue(final TSString name)
  	{
  		return bindingObject.getProperty(name);
  	}

  	/** Try to delete a binding for a name.
   	 *
   	 *  @return success (1) or failure (0). TODO: the return type should be
   	 *  TSBoolean.
   	 */
  	TSBoolean deleteBinding(final TSString name)
  	{
    	return TSBoolean.create(bindingObject.deleteProperty(name));
  	}

  
  	TSValue implicitThisValue()
  	{
    	return TSUndefined.value;
  	}

  	void createImmutableBinding(final TSString name)
  	{
  		assert false : "createImmutableBinding is unsupported in ObjectEnvironment";
  	}

  	void initializeImmutableBinding(final TSString name, final TSValue value)
  	{
  		assert false : "initializeImmutableBinding is unsupported in ObjectEnvironment";
  	}
}