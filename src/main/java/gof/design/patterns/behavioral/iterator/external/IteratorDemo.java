package gof.design.patterns.behavioral.iterator.external;

import gof.design.patterns.behavioral.iterator.internal.FilteringListTraverser;
import gof.design.patterns.behavioral.iterator.internal.FilteringNameLengthListTraverser;
import gof.design.patterns.behavioral.iterator.internal.PrintNEmployees;

public class IteratorDemo {

	public static void main(String[] args) {
		AbstractList<Employee> employees = new List<>(2, Employee.class);
		employees.add(new Employee("Bryan", 34));
		employees.add(new Employee("Mark", 32));
		printEmployees(employees.createIterator());
		
		// internal iterator example code.
		PrintNEmployees printNEmployees = new PrintNEmployees(employees, 2);
		printNEmployees.traverse();
		
		// internal iterator based on filter condition.
		FilteringListTraverser<Employee> filteringTraverser = new FilteringNameLengthListTraverser(employees);
		filteringTraverser.traverse();
	}

	private static void printEmployees(Iterator<Employee> it) {
		// external iterator example code.
		for (it.first(); !it.isDone(); it.next()) {
			it.currentItem().print();
		}
	}

}
