package gof.design.patterns.structural.bridge;

import gof.design.patterns.structural.adapter.Point;

// Defines the Abstraction.
public abstract class Window {
	private final View contents;

	public Window(View contents) {
		super();
		this.contents = contents;
	}

	public abstract void drawContents();

	public abstract void drawRect(final Point p1, final Point p2);

	protected WindowImp getWindowImpl() {
		return WindowSystemFactory.getInstance().makeWindowImp();
	}

	public View getView() {
		return this.contents;
	}
}
