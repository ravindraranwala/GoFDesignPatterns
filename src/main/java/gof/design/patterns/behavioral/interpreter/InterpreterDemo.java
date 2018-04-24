package gof.design.patterns.behavioral.interpreter;

public class InterpreterDemo {

	public static void main(String[] args) {
		VariableExp x = new VariableExp("X");
		VariableExp y = new VariableExp("Y");
		final BooleanExp expression = new OrExp(new AndExp(new Constant(true), x), new AndExp(y, new NotExp(x)));
		final Context context = new Context();
		context.assign(x, false);
		context.assign(y, true);

		System.out.println("Your expression evaluates to: " + expression.evaluate(context));

		VariableExp z = new VariableExp("Z");
		BooleanExp not_z = new NotExp(z);
		BooleanExp replacement = expression.replace("Y", not_z);
		context.assign(z, true);

		System.out.println(
				"After the replacement of Y from Z, your expression evaluates to: " + replacement.evaluate(context));
	}

}
