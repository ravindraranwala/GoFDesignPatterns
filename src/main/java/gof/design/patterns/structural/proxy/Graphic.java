package gof.design.patterns.structural.proxy;

import gof.design.patterns.structural.adapter.Point;

public interface Graphic {
	void draw(Point at);
	void handleMouse(Event event);
	Point getExtent();
}
