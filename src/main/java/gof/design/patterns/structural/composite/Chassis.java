package gof.design.patterns.structural.composite;

public class Chassis extends CompositeEquipment {

	public Chassis(String name) {
		super(name);
	}

	@Override
	public Currency netPrice() {
		/*
		 * Notice we have to add the price of chassis to the total cost of child
		 * equipments here.
		 */
		return new Currency(super.netPrice().getValue() + 34.2, CurrencyTypes.USD);
	}

}
