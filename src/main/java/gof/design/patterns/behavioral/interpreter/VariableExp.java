package gof.design.patterns.behavioral.interpreter;

public class VariableExp implements BooleanExp {
	private final String name;

	public VariableExp(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean evaluate(Context context) {
		return context.lookup(this.name);
	}

	@Override
	public BooleanExp replace(String varName, BooleanExp expr) {
		if (this.name.equals(varName)) {
			return expr.copy();
		}
		return this;
	}

	@Override
	public BooleanExp copy() {
		return new VariableExp(this.name);
	}

	public String getName() {
		return name;
	}

}
