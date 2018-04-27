package gof.design.patterns.behavioral.iterator.external;

import java.lang.reflect.Array;

public class List<S> implements AbstractList<S> {
	private final S[] elements;
	private int size = 0;

	public List(int size, Class<S> elementType) {
		super();
		this.elements = (S[]) Array.newInstance(elementType, size);
	}

	@Override
	public int count() {
		return this.elements.length;
	}

	@Override
	public S get(int index) {
		return this.elements[index];
	}

	@Override
	public Iterator<S> createIterator() {
		// Notice the Factory method here.
		return new ListIterator<>(this);
	}

	@Override
	public void add(S item) {
		this.elements[size++] = item;
	}
}
