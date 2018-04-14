package gof.design.patterns.structural.facade;

public class RISCCodeGenerator extends CodeGenerator {

	public RISCCodeGenerator(ByteCodeStream output) {
		super(output);
	}

	@Override
	void visit(StatementNode stmtNode) {
		System.out.println("generating RISC byte code for statement node.");
	}

	@Override
	void visit(ExpressionNode exprNode) {
		System.out.println("generating RISC byte code for expression node.");
	}

}
