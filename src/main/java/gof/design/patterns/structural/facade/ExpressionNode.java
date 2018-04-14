package gof.design.patterns.structural.facade;

import java.util.List;

public class ExpressionNode extends ProgramNode {

	public ExpressionNode(List<ProgramNode> childNodes) {
		super(childNodes);
	}

	@Override
	void getSourcePosition(int line, int index) {
		System.out.println("Expression Node source position line: " + line + " index: " + index);
	}

	@Override
	void add(ProgramNode child) {
		this.childNodes.add(child);
	}

	@Override
	void remove(ProgramNode child) {
		this.childNodes.remove(child);
	}

	@Override
	void traverse(CodeGenerator codeGenerator) {
		codeGenerator.visit(this);
		this.childNodes.forEach(child -> child.traverse(codeGenerator));
	}

}
