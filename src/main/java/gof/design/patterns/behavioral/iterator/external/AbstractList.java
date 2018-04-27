package gof.design.patterns.behavioral.iterator.external;

public interface AbstractList<S> {
	int count();

	S get(int index);

	void add(S item);

	Iterator<S> createIterator();
}
