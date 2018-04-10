package gof.design.patterns.structural.decorator;

/**
 * Concrete Decorator for adding Scrolling functionality to the
 * {@link VisualComponent}
 * 
 * @author URANWRA
 *
 */
public class ScrollDecorator extends Decorator {

	public ScrollDecorator(VisualComponent component) {
		super(component);
	}

	@Override
	public void draw() {
		super.draw();
		this.drawScrollBar();
	}

	private void drawScrollBar() {
		System.out.println("Adding a Scroll Bar ...");
	}

}
