package gof.design.patterns.casestudy;

// Concrete Decorator.
public class Scroller extends MonoGlyph {

	public Scroller(Glyph component) {
		super(component);
	}

	@Override
	public void draw(Window w) {
		super.draw(w);
		System.out.println("Clipping the out of view content...");
		System.out.println("Adding the border...");
	}

}
