package gof.design.patterns.behavioral.interpreter;

public class OrExp implements BooleanExp {
	private final BooleanExp operand1;
	private final BooleanExp operand2;

	public OrExp(BooleanExp operand1, BooleanExp operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
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
