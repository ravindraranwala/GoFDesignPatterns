package gof.design.patterns.structural.facade;

import java.util.List;

public abstract class ProgramNode {
	protected final List<ProgramNode> childNodes;

	public ProgramNode(List<ProgramNode> childNodes) {
		super();
		this.childNodes = childNodes;
	}

	// program node manipulation.
	abstract void getSourcePosition(int line, int index);

	// child manipulation.
	abstract void add(ProgramNode child);

	abstract void remove(ProgramNode child);

	abstract void traverse(CodeGenerator codeGenerator);
}
