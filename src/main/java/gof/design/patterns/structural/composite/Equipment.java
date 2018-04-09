package gof.design.patterns.structural.composite;

// Defines the Component class.
public class Equipment {
	private final String name;

	public Equipment(String name) {
		super();
		this.name = name;
	}

	public Currency netPrice() {
		return new Currency(0.0, CurrencyTypes.USD);
	}

	public Watt power() {
		return new Watt(0.0, PowerUnits.WATT);
	}

	public void add(Equipment equipment) {
		throw new UnsupportedOperationException();
	}

	public void remove(Equipment equipment) {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return name;
	}

}
