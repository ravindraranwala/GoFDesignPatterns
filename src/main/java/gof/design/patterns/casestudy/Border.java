package gof.design.patterns.casestudy;

// Concrete Decorator.
public class Border extends MonoGlyph {
	public Border(Glyph component) {
		super(component);
	}

	@Override
	public void draw(Window w) {
		super.draw(w);
		this.drawBorder();
	}

	private final void drawBorder() {
		System.out.println("Drawing the Border...");
	}
}
