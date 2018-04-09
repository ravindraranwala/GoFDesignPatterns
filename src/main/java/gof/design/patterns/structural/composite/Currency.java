package gof.design.patterns.structural.composite;

public class Currency {
	private final double value;
	private final CurrencyTypes type;

	public Currency(double value, CurrencyTypes type) {
		super();
		this.value = value;
		this.type = type;
	}

	public double getValue() {
		return value;
	}

	public CurrencyTypes getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Currency [value=" + value + ", type=" + type + "]";
	}

}
