package com.design.patterns.behavioural.visitor;

public class PayriseVisitor implements VisitorBase {
	private final double multiplier;

	private double totalIncrease;

	public PayriseVisitor(double multiplier) {
		super();
		this.multiplier = multiplier;
		this.totalIncrease = 0;
	}

	public void visit(Worker worker) {
		final double increase = worker.getMonthlySalary() * multiplier;
		worker.setMonthlySalary(worker.getMonthlySalary() + increase);
		totalIncrease += increase;
		System.out.printf("%s salary increased by %.2f.\n", worker.getName(), increase);

	}

	public double getTotalIncrease() {
		return totalIncrease;
	}

	public void visit(Manager manager) {
		final double increase = manager.getMonthlySalary() * multiplier;
		manager.setMonthlySalary(manager.getMonthlySalary() + increase);
		totalIncrease += increase;
		System.out.printf("%s salary increased by %.2f.\n", manager.getName(), increase);

	}

}
