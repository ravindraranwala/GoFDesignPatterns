package gof.design.patterns.structural.decorator;

/**
 * Concrete Decorator for adding a new Border around the {@link VisualComponent}
 * 
 * @author URANWRA
 *
 */
public class BorderDecorator extends Decorator {
	private final int width;

	public BorderDecorator(VisualComponent component, int borderWidth) {
		super(component);
		this.width = borderWidth;
	}

	@Override
	public void draw() {
		super.draw();
		this.drawBorder();
	}

	private void drawBorder() {
		System.out.println("Adding a border with width: " + this.width + " pixel(s).");
	}
}
