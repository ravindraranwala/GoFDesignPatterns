package gof.design.patterns.behavioral.interpreter;

/**
 * Terminal expression.
 * @author ravindra
 *
 */
public class VariableExp implements BooleanExp {
	final String name;

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
		return new VariableExp(this.name);
	}

	@Override
	public BooleanExp copy() {
		return new VariableExp(this.name);
	}
}
