package gof.design.patterns.behavioral.visitor;

import gof.design.patterns.structural.composite.Currency;
import gof.design.patterns.structural.composite.CurrencyTypes;

public class Chassis extends CompositeEquipment {
	private final double discountPercentage;

	public Chassis(String name, double discountPercentage) {
		super(name, 10);
		this.discountPercentage = discountPercentage;
	}

	@Override
	public Currency netPrice() {
		return new Currency(34.2, CurrencyTypes.USD);
	}

	@Override
	public Currency discountPrice() {
		final double discountPrice = 34.2 * (100 - this.discountPercentage) / 100;
		return new Currency(discountPrice, CurrencyTypes.USD);
	}

	@Override
	public void accept(EquipmentVisitor visitor) {
		this.equipments.forEach(equipment -> equipment.accept(visitor));
		visitor.visitChassis(this);
	}

}
