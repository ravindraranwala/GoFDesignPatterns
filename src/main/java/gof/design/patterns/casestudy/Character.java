package gof.design.patterns.casestudy;

import gof.design.patterns.structural.adapter.Point;

public class Character implements Glyph {
	private final char c;

	public Character(char c) {
		super();
		this.c = c;
	}

	@Override
	public void draw(Window w) {
		w.drawCharacter(this.c);
	}

	@Override
	public boolean intersects(Point p) {
		return false;
	}

	@Override
	public void insert(Glyph g, int offset) {
		throw new UnsupportedOperationException();
	}

}
