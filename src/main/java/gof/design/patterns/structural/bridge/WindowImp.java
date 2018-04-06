package gof.design.patterns.structural.bridge;

import gof.design.patterns.structural.adapter.Coord;

// Defines the Implementor.
public interface WindowImp {
	void deviceRect(Coord x0, Coord y0, Coord x1, Coord y1);
	
	void deviceBitmap(String bitmapName, Coord x, Coord y);
}
