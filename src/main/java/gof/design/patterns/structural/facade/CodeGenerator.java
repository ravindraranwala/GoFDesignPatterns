package gof.design.patterns.structural.facade;

public abstract class CodeGenerator {
	protected final ByteCodeStream output;

	public CodeGenerator(ByteCodeStream output) {
		super();
		this.output = output;
	}

	abstract void visit(StatementNode stmtNode);

	abstract void visit(ExpressionNode exprNode);
}
