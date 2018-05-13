package gof.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private final List<Observer> observers = new ArrayList<>();

	public void attach(Observer o) {
		this.observers.add(o);
	}

	public void detach(Observer o) {
		this.observers.remove(o);
	}

	public void notifyObservers() {
		this.observers.forEach(o -> o.update(this));
	}
}
