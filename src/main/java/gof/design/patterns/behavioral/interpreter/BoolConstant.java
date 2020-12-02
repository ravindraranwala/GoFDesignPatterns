package gof.design.patterns.behavioral.interpreter;

/**
 * Terminal expression
 * 
 * @author ravindra
 *
 */
public enum BoolConstant implements BooleanExp {
	TRUE(true), FALSE(false);
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

	private final boolean value;

	BoolConstant(boolean value) {
		this.value = value;
	}
}
