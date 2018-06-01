package gof.design.patterns.casestudy;

import gof.design.patterns.structural.adapter.Point;

public interface Glyph {
	void draw(Window w);

	boolean intersects(Point p);

	void insert(Glyph g, int offset);
}
