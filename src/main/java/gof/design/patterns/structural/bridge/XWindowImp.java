package gof.design.patterns.structural.bridge;

import gof.design.patterns.structural.adapter.Coord;

//Defines the concrete implementor.
public class XWindowImp implements WindowImp {

	@Override
	public void deviceRect(Coord x0, Coord y0, Coord x1, Coord y1) {
		final int x = Math.min(x0.getValue(), x1.getValue());
		final int y = Math.min(y0.getValue(), y1.getValue());
		final int w = Math.abs(x0.getValue() - x1.getValue());
		final int h = Math.abs(y0.getValue() - y1.getValue());

		System.out.println("Drawing on XWindow: " + " x: " + x + " y: " + y + " width: " + w + " height: " + h);
	}

	@Override
	public void deviceBitmap(String bitmapName, Coord x, Coord y) {
		System.out.println("Drawing the bitmap on XWindow with the Name: " + bitmapName + " At the coordinates x: "
				+ x.getValue() + " y: " + y.getValue());
	}

}
