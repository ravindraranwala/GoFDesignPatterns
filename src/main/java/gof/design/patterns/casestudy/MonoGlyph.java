package gof.design.patterns.casestudy;

import gof.design.patterns.structural.adapter.Point;

// Base Decorator.
public class MonoGlyph implements Glyph {
	private final Glyph component;

	public MonoGlyph(Glyph component) {
		super();
		this.component = component;
	}

	@Override
	public void draw(Window w) {
		this.component.draw(w);
	}

	@Override
	public boolean intersects(Point p) {
		return false;
	}

	@Override
	public void insert(Glyph g, int offset) {

	}

}
