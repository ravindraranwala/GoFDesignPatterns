package gof.design.patterns.structural.bridge;

import gof.design.patterns.structural.adapter.Coord;
import gof.design.patterns.structural.adapter.Point;

// Defines the Refined Abstraction.
public class ApplicationWindow extends Window {
	public ApplicationWindow(View contents) {
		super(contents);
	}

	@Override
	public void drawContents() {
		this.getView().drawOn(this);
	}

	@Override
	public void drawRect(Point p1, Point p2) {
		getWindowImpl().deviceRect(new Coord(p1.getX()), new Coord(p1.getY()), new Coord(p2.getX()),
				new Coord(p2.getY()));
	}

}
