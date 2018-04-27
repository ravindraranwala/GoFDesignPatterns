package gof.design.patterns.behavioral.iterator.internal;

import gof.design.patterns.behavioral.iterator.external.AbstractList;
import gof.design.patterns.behavioral.iterator.external.Iterator;

public abstract class ListTraverser<S> {
	private final Iterator<S> iterator;

	public ListTraverser(AbstractList<S> list) {
		super();
		this.iterator = list.createIterator();
	}

	protected abstract boolean processItem(S item);

	public boolean traverse() {
		boolean result = false;
		for (iterator.first(); !iterator.isDone(); iterator.next()) {
			result = this.processItem(iterator.currentItem());
			if (result == false) {
				break;
			}
		}
		return result;
	}

}
