package gof.design.patterns.behavioral.interpreter;

public class OrExp implements BooleanExp {
	private final BooleanExp operand1;
	private final BooleanExp operand2;

	public OrExp(BooleanExp op1, BooleanExp op2) {
		this.operand1 = op1;
		this.operand2 = op2;
	}

	@Override
	public boolean evaluate(Context context) {
		return this.operand1.evaluate(context) || this.operand2.evaluate(context);
	}

	@Override
	public BooleanExp replace(String var, BooleanExp expr) {
		return new OrExp(this.operand1.replace(var, expr), this.operand2.replace(var, expr));
	}

	@Override
	public BooleanExp copy() {
		return new OrExp(this.operand1.copy(), this.operand2.copy());
	}

}
