package gof.design.patterns.behavioral.visitor;

public class Bus extends CompositeEquipment {
	public Bus(String name, double discountPercentage) {
		super(name, discountPercentage);
	}

	@Override
	public double netPrice() {
		return 7.4;
	}

	@Override
	public double discountPrice() {
		final double discountPrice = 7.4 * (100 - this.discountPercentage) / 100;
		return discountPrice;
	}

	@Override
	public double power() {
		return 3.1;
	}

	@Override
	public void accept(EquipmentVisitor visitor) {
		for (Equipment equipment : equipments)
			equipment.accept(visitor);

		visitor.visitBus(this);
	}

}
