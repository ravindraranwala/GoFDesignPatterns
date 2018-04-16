package gof.design.patterns.structural.proxy;

import gof.design.patterns.structural.adapter.Point;

public class TextDocument {
	private Graphic graphic;

	public void insert(Graphic graphic) {
		this.graphic = graphic;
		this.graphic.draw(new Point(2, 5));
	}
}
