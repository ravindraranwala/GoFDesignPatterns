package gof.design.patterns.structural.composite;

public class Card extends Equipment {

	public Card(String name) {
		super(name);
	}

	@Override
	public double netPrice() {
		return 4.2;
	}

	@Override
	public double power() {
		return 1.6;
	}

}
