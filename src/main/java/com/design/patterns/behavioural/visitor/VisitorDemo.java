package com.design.patterns.behavioural.visitor;

public class VisitorDemo {

	public static void main(String[] args) {
		Manager bob = new Manager("Bob", 5000);
		Manager sue = new Manager("Sue", 4000);
		Worker jim = new Worker("Jim", 2000);
		Worker tom = new Worker("Tom", 1800);
		Worker mel = new Worker("Mel", 1900);

		bob.addSubordinate(sue);
		bob.addSubordinate(jim);
		sue.addSubordinate(tom);
		sue.addSubordinate(mel);

		OrganisationalStructure orgStructure = new OrganisationalStructure(bob);

		PayrollVisitor payroll = new PayrollVisitor();
		PayriseVisitor payrise = new PayriseVisitor(0.05);

		orgStructure.accept(payroll);
		orgStructure.accept(payrise);
		orgStructure.accept(payroll);

		System.out.printf("Total pay increase = %.2f.\n", payrise.getTotalIncrease());
	}

}
