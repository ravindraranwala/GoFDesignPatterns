package gof.design.patterns.behavioral.interpreter;

public class Constant implements BooleanExp {
	private final boolean value;

	public Constant(boolean value) {
		super();
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
