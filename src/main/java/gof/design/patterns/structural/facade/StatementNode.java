package gof.design.patterns.structural.facade;

import java.util.List;

public class StatementNode extends ProgramNode {

	public StatementNode(List<ProgramNode> childNodes) {
		super(childNodes);
	}

	@Override
	public void getSourcePosition(int line, int index) {
		System.out.println("Statement Node source position line: " + line + " index: " + index);
	}

	@Override
	public void add(ProgramNode child) {
		this.childNodes.add(child);
	}

	@Override
	public void remove(ProgramNode child) {
		this.childNodes.remove(child);
	}

	@Override
	public void traverse(CodeGenerator codeGenerator) {
		
	}

}
