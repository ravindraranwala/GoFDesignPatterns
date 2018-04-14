package gof.design.patterns.structural.facade;

public class ProgramNodeBuilder {
	public ProgramNode newVariable(final String variableName) {
		System.out.println("Building parser tree for variable: " + variableName);
		return null;
	}

	public ProgramNode newAssignment(ProgramNode variable, ProgramNode expression) {
		System.out.println("Building parser tree for the expression.");
		return null;
	}

	public ProgramNode newReturnStatement(ProgramNode value) {
		System.out.println("Building parser tree for the return statement.");
		return null;
	}
}
