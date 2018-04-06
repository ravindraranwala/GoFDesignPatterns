package gof.design.patterns.structural.bridge;

import gof.design.patterns.structural.adapter.Coord;
import gof.design.patterns.structural.adapter.Point;

//Defines the Refined Abstraction.
public class IconWindow extends Window {
	private final String bitmapName = "someBitmapName";

	public IconWindow(View contents) {
		super(contents);
	}

	@Override
	public void drawContents() {
		getWindowImpl().deviceBitmap(bitmapName, new Coord(0), new Coord(0));
	}

	@Override
	public void drawRect(Point p1, Point p2) {
		getWindowImpl().deviceRect(new Coord(p1.getX()), new Coord(p1.getY()), new Coord(p2.getX()),
				new Coord(p2.getY()));
	}

}
