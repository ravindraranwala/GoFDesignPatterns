package com.design.patterns.behavioural.visitor;

public class Worker extends EmployeeBase {

	public Worker(String name, double monthlySalary) {
		super(name, monthlySalary);
	}

	@Override
	public void accept(VisitorBase visitor) {
		visitor.visit(this);

	}

}
