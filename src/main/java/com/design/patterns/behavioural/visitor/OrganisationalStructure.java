package com.design.patterns.behavioural.visitor;

public class OrganisationalStructure {
	private final EmployeeBase employee;

	public OrganisationalStructure(EmployeeBase firstEmployee) {
		super();
		this.employee = firstEmployee;
	}
	
	public void accept(VisitorBase visitor) {
		employee.accept(visitor);
	}
}
