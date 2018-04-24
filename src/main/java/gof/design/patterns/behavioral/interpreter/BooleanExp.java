package gof.design.patterns.behavioral.interpreter;

public interface BooleanExp {
	boolean evaluate(Context context);

	BooleanExp replace(String var, BooleanExp expr);

	BooleanExp copy();
}
