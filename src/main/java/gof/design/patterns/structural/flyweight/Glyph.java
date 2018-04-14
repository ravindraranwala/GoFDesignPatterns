package gof.design.patterns.structural.flyweight;

// Flyweight.
public interface Glyph {
	void draw(Window window, GlyphContext glyphContext);

	void next(GlyphContext glyphContext);

	void setFont(String font, GlyphContext glyphContext);

	String getFont(GlyphContext glyphContext);
}
