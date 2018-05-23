package gof.design.patterns.behavioral.visitor;

import gof.design.patterns.structural.composite.Currency;
import gof.design.patterns.structural.composite.CurrencyTypes;
import gof.design.patterns.structural.composite.PowerUnits;
import gof.design.patterns.structural.composite.Watt;

public abstract class Equipment {
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

	public Currency discountPrice() {
		throw new UnsupportedOperationException();
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

	public abstract void accept(EquipmentVisitor visitor);
}
