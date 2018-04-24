package gof.design.patterns.behavioral.interpreter;

public class NotExp implements BooleanExp {
	private final BooleanExp operand;

	public NotExp(BooleanExp operand) {
		super();
		this.operand = operand;
	}

	@Override
	public boolean evaluate(Context context) {
		return !this.operand.evaluate(context);
	}

	@Override
	public BooleanExp replace(String var, BooleanExp expr) {
		return new NotExp(this.operand.replace(var, expr));
	}

	@Override
	public BooleanExp copy() {
		return new NotExp(this.operand.copy());
	}

}
