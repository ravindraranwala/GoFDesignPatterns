package gof.design.patterns.structural.bridge;

import gof.design.patterns.structural.adapter.Point;

public class Bridgedemo {

	public static void main(String[] args) {
		final IconWindow iconWindow = new IconWindow(new View());
		iconWindow.drawContents();
		iconWindow.drawRect(new Point(1, 7), new Point(8, 16));

		final ApplicationWindow applicationWindow = new ApplicationWindow(new View());
		applicationWindow.drawContents();
	}

}
