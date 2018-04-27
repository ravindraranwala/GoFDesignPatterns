package gof.design.patterns.behavioral.iterator.internal;

import gof.design.patterns.behavioral.iterator.external.AbstractList;
import gof.design.patterns.behavioral.iterator.external.Iterator;

public abstract class FilteringListTraverser<S> extends ListTraverser<S> {
	private final Iterator<S> iterator;

	public FilteringListTraverser(AbstractList<S> list) {
		super(list);
		this.iterator = list.createIterator();
	}

	@Override
	public boolean traverse() {
		boolean result = false;
		for (iterator.first(); !iterator.isDone(); iterator.next()) {
			if (this.testItem(iterator.currentItem())) {
				result = this.processItem(this.iterator.currentItem());
				if (result == false) {
					break;
				}
			}
		}
		return result;
	}

	protected abstract boolean testItem(S item);

}
