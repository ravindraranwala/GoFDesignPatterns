package gof.design.patterns.behavioral.iterator.internal;

import gof.design.patterns.behavioral.iterator.external.AbstractList;
import gof.design.patterns.behavioral.iterator.external.Employee;

public class PrintNEmployees extends ListTraverser<Employee> {
	private final int total;
	private int count;

	public PrintNEmployees(AbstractList<Employee> list, int n) {
		super(list);
		this.total = n;
		this.count = 0;
	}

	@Override
	protected boolean processItem(Employee emp) {
		this.count++;
		emp.print();
		return this.count < this.total;
	}

}
