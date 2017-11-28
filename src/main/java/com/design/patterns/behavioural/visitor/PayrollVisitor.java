package com.design.patterns.behavioural.visitor;

public class PayrollVisitor implements VisitorBase {

	public void visit(Worker worker) {
		System.out.printf("%s paid %.2f.\n", worker.getName(), worker.getMonthlySalary());

	}

	public void visit(Manager manager) {
		System.out.printf("%s paid %.2f + Bonus.\n", manager.getName(), manager.getMonthlySalary());

	}

}
