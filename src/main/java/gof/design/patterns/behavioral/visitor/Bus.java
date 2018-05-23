package gof.design.patterns.behavioral.visitor;

import gof.design.patterns.structural.composite.Currency;
import gof.design.patterns.structural.composite.CurrencyTypes;
import gof.design.patterns.structural.composite.PowerUnits;
import gof.design.patterns.structural.composite.Watt;

public class Bus extends CompositeEquipment {
	private final double discountPercentage;

	public Bus(String name, double discountPercentage) {
		super(name, discountPercentage);
		this.discountPercentage = discountPercentage;
	}

	@Override
	public Currency netPrice() {
		return new Currency(7.4, CurrencyTypes.USD);
	}

	@Override
	public Currency discountPrice() {
		final double discountPrice = 7.4 * (100 - this.discountPercentage) / 100;
		return new Currency(discountPrice, CurrencyTypes.USD);
	}

	@Override
	public Watt power() {
		return new Watt(3.1, PowerUnits.WATT);
	}

	@Override
	public void accept(EquipmentVisitor visitor) {
		this.equipments.forEach(equipment -> equipment.accept(visitor));
		visitor.visitBus(this);
	}

}
