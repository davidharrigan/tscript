
package ts.support;

public abstract class TSObject extends TSValue
{
	public TSNumber toNumber() {
		return TSNumber.create(1);
	}

	public TSBoolean toBoolean() {
		return TSBoolean.create(true);
	}
}