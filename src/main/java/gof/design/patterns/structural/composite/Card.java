package gof.design.patterns.structural.composite;

public class Card extends Equipment {

	public Card(String name) {
		super(name);
	}

	@Override
	public Currency netPrice() {
		return new Currency(4.2, CurrencyTypes.USD);
	}

	@Override
	public Watt power() {
		return new Watt(1.6, PowerUnits.WATT);
	}

}
