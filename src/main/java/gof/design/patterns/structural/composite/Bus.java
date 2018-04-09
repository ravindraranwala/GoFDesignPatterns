package gof.design.patterns.structural.composite;

public class Bus extends CompositeEquipment {

	public Bus(String name) {
		super(name);
	}

	@Override
	public Currency netPrice() {
		// Notice we have to include the cost of the bus here.
		return new Currency(super.netPrice().getValue() + 7.4, CurrencyTypes.USD);
	}

	@Override
	public Watt power() {
		// Notice we have to add the power of the bus if that exists.
		// Otherwise use the parent implementation directly.
		return new Watt(super.power().getValue() + 3.1, PowerUnits.WATT);
	}

}
