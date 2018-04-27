package gof.design.patterns.behavioral.iterator.external;

public interface Iterator<T> {
	void first();
	void next();
	boolean isDone();
	T currentItem();
}
