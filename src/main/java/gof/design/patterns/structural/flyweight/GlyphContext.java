package gof.design.patterns.structural.flyweight;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GlyphContext {
	// index is used only for tree traversal.
	private int index = 0;
	// Notice the font is the extrinsic state here.
	private List<String> fonts = Arrays.asList("Times-12", "Times-12 Italics");

	public void next() {
		this.index++;
	}

	public String getFont() {
		// traverse the tree and find the font.
		// I just mock up the tree-traversal using random values here.
		final int offset = ThreadLocalRandom.current().nextInt(0, 2);
		return fonts.get(offset);
	}
}
