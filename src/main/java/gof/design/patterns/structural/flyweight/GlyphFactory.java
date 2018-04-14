package gof.design.patterns.structural.flyweight;

// Flyweight Factory.
public class GlyphFactory {
	private static final int NCHARCODES = 128;
	private final Character[] character = new Character[NCHARCODES];

	public Character createCharacter(char c) {
		if (character[c] == null) {
			character[c] = new Character(c);
		}
		return character[c];
	}
}
