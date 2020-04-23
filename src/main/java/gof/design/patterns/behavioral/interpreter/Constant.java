package gof.design.patterns.behavioral.interpreter;

/**
 * Terminal expression
 * 
 * @author ravindra
 *
 */
public class Constant implements BooleanExp {
	private final boolean value;

	public Constant(boolean value) {
		this.value = value;
	}

	@Override
	public boolean evaluate(Context context) {
		return this.value;
	}

	@Override
	public BooleanExp replace(String var, BooleanExp expr) {
		return this;
	}

	@Override
	public BooleanExp copy() {
		return this;
	}
}
