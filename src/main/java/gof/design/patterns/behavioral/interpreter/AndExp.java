package gof.design.patterns.behavioral.interpreter;

public class AndExp implements BooleanExp {
	private final BooleanExp operand1;
	private final BooleanExp operand2;

	public AndExp(BooleanExp op1, BooleanExp op2) {
		this.operand1 = op1;
		this.operand2 = op2;
	}

	@Override
	public boolean evaluate(Context context) {
		return this.operand1.evaluate(context) && this.operand2.evaluate(context);
	}

	@Override
	public BooleanExp replace(String var, BooleanExp expr) {
		return new AndExp(this.operand1.replace(var, expr), this.operand2.replace(var, expr));
	}

	@Override
	public BooleanExp copy() {
		return new AndExp(operand1.copy(), operand2.copy());
	}

}
