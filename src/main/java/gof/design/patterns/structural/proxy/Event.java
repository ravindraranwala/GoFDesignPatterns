package gof.design.patterns.structural.proxy;

public class Event {
	private final int keyCode;

	public Event(int keyCode) {
		super();
		this.keyCode = keyCode;
	}

	public int getKeyCode() {
		return keyCode;
	}

}
