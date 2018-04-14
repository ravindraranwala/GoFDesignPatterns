package gof.design.patterns.structural.flyweight;

public class FlyweightDemo {

	public static void main(String[] args) {
		final Window window = new Window();
		final GlyphContext glyphContext = new GlyphContext();
		final GlyphFactory flyweightFactory = new GlyphFactory();
		Character charOne = flyweightFactory.createCharacter('O');
		charOne.draw(window, glyphContext);
		Character chartwo = flyweightFactory.createCharacter('b');
		chartwo.draw(window, glyphContext);
		Character charThree = flyweightFactory.createCharacter('j');
		charThree.draw(window, glyphContext);
		Character charFour = flyweightFactory.createCharacter('e');
		charFour.draw(window, glyphContext);
		Character charFive = flyweightFactory.createCharacter('c');
		charFive.draw(window, glyphContext);
		Character charSix = flyweightFactory.createCharacter('t');
		charSix.draw(window, glyphContext);
		Character charSeven = flyweightFactory.createCharacter('-');
		charSeven.draw(window, glyphContext);
		Character charEight = flyweightFactory.createCharacter('o');
		charEight.draw(window, glyphContext);
		flyweightFactory.createCharacter('r');
		flyweightFactory.createCharacter('i');
		Character charNine = flyweightFactory.createCharacter('e');
		charNine.draw(window, glyphContext);
		flyweightFactory.createCharacter('n');
		flyweightFactory.createCharacter('t');
		flyweightFactory.createCharacter('e');
		flyweightFactory.createCharacter('d');
		flyweightFactory.createCharacter(' ');
		flyweightFactory.createCharacter('p');
		flyweightFactory.createCharacter('r');
		flyweightFactory.createCharacter('o');
		flyweightFactory.createCharacter('g');

		if (charFour.equals(charNine)) {
			System.out.println("same char is shared for all the occurances of e.");
		}
	}

}
