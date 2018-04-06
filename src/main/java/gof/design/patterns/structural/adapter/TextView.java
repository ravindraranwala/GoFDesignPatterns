package gof.design.patterns.structural.adapter;

// Adaptee, presumably coming from a Toolkit.
public class TextView {
	private Coord x = null;
	private Coord y = null;

	private Coord width = null;
	private Coord height = null;

	public void getOrigin(Coord x, Coord y) {
		this.x = x;
		this.y = y;
	}

	public void getExtent(Coord width, Coord height) {
		this.width = width;
		this.height = height;
	}

	public boolean isEmpty() {
		return false;
	}

	public Coord getX() {
		return x;
	}

	public void setX(Coord x) {
		this.x = x;
	}

	public Coord getY() {
		return y;
	}

	public void setY(Coord y) {
		this.y = y;
	}

	public Coord getWidth() {
		return width;
	}

	public void setWidth(Coord width) {
		this.width = width;
	}

	public Coord getHeight() {
		return height;
	}

	public void setHeight(Coord height) {
		this.height = height;
	}

}
