package com.design.patterns.behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class Manager extends EmployeeBase {
	private final List<EmployeeBase> subordinates;

	public Manager(String name, double monthlySalary) {
		super(name, monthlySalary);
		this.subordinates = new ArrayList<EmployeeBase>();
	}

	@Override
	public void accept(VisitorBase visitor) {
		visitor.visit(this);

		for (EmployeeBase subordinate : subordinates) {
			subordinate.accept(visitor);
		}
	}

	public void addSubordinate(EmployeeBase subordinate) {
		this.subordinates.add(subordinate);
	}

}
