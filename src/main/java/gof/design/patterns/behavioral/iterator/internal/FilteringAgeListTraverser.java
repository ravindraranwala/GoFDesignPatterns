package gof.design.patterns.behavioral.iterator.internal;

import gof.design.patterns.behavioral.iterator.external.AbstractList;
import gof.design.patterns.behavioral.iterator.external.Employee;

public class FilteringAgeListTraverser extends FilteringListTraverser<Employee> {
	public FilteringAgeListTraverser(AbstractList<Employee> list) {
		super(list);
	}

	@Override
	protected boolean testItem(Employee item) {
		// Filters out employees whose age is < 30.
		return item.getAge() >= 30;
	}

	@Override
	protected boolean processItem(Employee item) {
		item.print();
		return true;
	}

}
