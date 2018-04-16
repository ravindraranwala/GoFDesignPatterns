package gof.design.patterns.structural.proxy;

import gof.design.patterns.structural.adapter.Point;

public class ImageProxy implements Graphic {
	private final String fileName;
	private Point extent;
	private Image image;

	public ImageProxy(String fileName) {
		super();
		this.fileName = fileName;
		this.extent = null;
		this.image = null;
	}

	@Override
	public void draw(Point at) {
		this.getImage().draw(at);
	}

	@Override
	public void handleMouse(Event event) {
		this.getImage().handleMouse(event);
	}

	@Override
	public Point getExtent() {
		if (this.extent == null) {
			this.extent = this.getImage().getExtent();
		}
		return this.extent;
	}

	protected Image getImage() {
		System.out.println("Reading the image from file system.");
		if (this.image == null) {
			this.image = new Image(fileName);
		}
		return this.image;
	}

}
