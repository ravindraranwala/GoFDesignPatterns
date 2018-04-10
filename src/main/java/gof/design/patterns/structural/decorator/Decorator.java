package gof.design.patterns.structural.decorator;

// Base Decorator class.
public class Decorator implements VisualComponent {
	private final VisualComponent component;

	public Decorator(VisualComponent component) {
		super();
		this.component = component;
	}

	@Override
	public void draw() {
		// Notice forwarding of the request to the wrapped component.
		this.component.draw();
	}

}
