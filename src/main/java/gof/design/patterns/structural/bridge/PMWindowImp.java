package gof.design.patterns.structural.bridge;

import java.util.Arrays;
import java.util.List;

import gof.design.patterns.structural.adapter.Coord;
import gof.design.patterns.structural.adapter.Point;

//Defines the concrete implementor.
public class PMWindowImp implements WindowImp {

	@Override
	public void deviceRect(Coord x0, Coord y0, Coord x1, Coord y1) {
		final int left = Math.min(x0.getValue(), x1.getValue());
		final int right = Math.max(x0.getValue(), x1.getValue());
		final int bottom = Math.min(y0.getValue(), y1.getValue());
		final int top = Math.max(y0.getValue(), y1.getValue());

		// points can be used in real circumstances.
		final List<Point> points = Arrays.asList(new Point(left, top), new Point(right, top), new Point(right, bottom),
				new Point(left, bottom));

		System.out.println("Drawing on PMWindow: " + " left: " + left + " right: " + right + " bottom: " + bottom
				+ " top: " + top);
	}

	@Override
	public void deviceBitmap(String bitmapName, Coord x, Coord y) {
		System.out.println("Drawing the bitmap on PM Window with the Name: " + bitmapName + " At the coordinates x: "
				+ x.getValue() + " y: " + y.getValue());
	}

}
