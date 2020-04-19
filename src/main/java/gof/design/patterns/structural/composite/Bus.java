package gof.design.patterns.structural.composite;

public class Bus extends CompositeEquipment {

	public Bus(String name) {
		super(name);
	}

	@Override
	public double netPrice() {
		// Notice we have to include the cost of the bus here.
		return super.netPrice() + 7.4;
	}

	@Override
	public double power() {
		// Notice we have to add the power of the bus if that exists.
		// Otherwise use the parent implementation directly.
		return super.power() + 3.1;
	}

}
