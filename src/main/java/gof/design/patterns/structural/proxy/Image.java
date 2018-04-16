package gof.design.patterns.structural.proxy;

import gof.design.patterns.structural.adapter.Point;

public class Image implements Graphic {
	// loads image from a file.
	private final String fileName;
	private Point extent;

	public Image(String fileName) {
		super();
		this.fileName = fileName;
		this.extent = new Point(20, 50);
	}

	@Override
	public void draw(Point at) {
		System.out.println("Drawing image at coordinates x: " + at.getX() + " y: " + at.getY());
	}

	@Override
	public void handleMouse(Event event) {
		System.out.println("Resizing the image.");
	}

	@Override
	public Point getExtent() {
		return this.extent;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setExtent(Point extent) {
		this.extent = extent;
	}

}
