package gof.design.patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
	private final Map<String, Boolean> varToBoolVal = new HashMap<>();

	public boolean lookup(String varName) {
		return this.varToBoolVal.get(varName);
	}

	void assign(VariableExp expr, boolean val) {
		this.varToBoolVal.put(expr.getName(), val);
	}

}
