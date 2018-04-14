package gof.design.patterns.structural.flyweight;

// Concrete Flyweight.
public class Character implements Glyph {
	// Defines the intrinsic state.
	private final int charCode;

	public Character(int charCode) {
		super();
		this.charCode = charCode;
	}

	@Override
	public void draw(Window window, GlyphContext glyphContext) {
		System.out.println("Drawing char: " + (char) charCode + " with font: " + this.getFont(glyphContext));
	}

	@Override
	public void next(GlyphContext glyphContext) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setFont(String font, GlyphContext glyphContext) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getFont(GlyphContext glyphContext) {
		return glyphContext.getFont();
	}

}
