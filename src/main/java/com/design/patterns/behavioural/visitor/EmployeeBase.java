package com.design.patterns.behavioural.visitor;

public abstract class EmployeeBase {
	private final String name;

	private double monthlySalary;

	public EmployeeBase(String name, double monthlySalary) {
		super();
		this.name = name;
		this.monthlySalary = monthlySalary;
	}

	public String getName() {
		return name;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public abstract void accept(VisitorBase visitor);

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

}
