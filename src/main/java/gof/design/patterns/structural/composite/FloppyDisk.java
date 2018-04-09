package gof.design.patterns.structural.composite;

// Leaf class.
public class FloppyDisk extends Equipment {

	public FloppyDisk(String name) {
		super(name);
	}

	@Override
	public Currency netPrice() {
		return new Currency(1.8, CurrencyTypes.USD);
	}

	@Override
	public Watt power() {
		return new Watt(2.2, PowerUnits.WATT);
	}

}
