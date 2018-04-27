package gof.design.patterns.behavioral.iterator.internal;

import gof.design.patterns.behavioral.iterator.external.AbstractList;
import gof.design.patterns.behavioral.iterator.external.Employee;

public class FilteringNameLengthListTraverser extends FilteringListTraverser<Employee> {
	public FilteringNameLengthListTraverser(AbstractList<Employee> list) {
		super(list);
	}

	@Override
	protected boolean testItem(Employee item) {
		// Filters out names with character length < 5
		return item.getName().length() >= 5;
	}

	@Override
	protected boolean processItem(Employee item) {
		item.print();
		return true;
	}

}
