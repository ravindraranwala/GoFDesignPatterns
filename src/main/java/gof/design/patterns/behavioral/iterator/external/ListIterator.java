package gof.design.patterns.behavioral.iterator.external;

public class ListIterator<T> implements Iterator<T> {
	private int current = -1;
	private final AbstractList<T> list;

	public ListIterator(AbstractList<T> list) {
		super();
		this.list = list;
	}

	@Override
	public void first() {
		this.current = 0;
	}

	@Override
	public void next() {
		this.current++;

	}

	@Override
	public boolean isDone() {
		return this.current >= list.count();
	}

	@Override
	public T currentItem() {
		if (this.isDone()) {
			throw new IteratorOutOfBoundsException();
		}
		return this.list.get(this.current);
	}

}
