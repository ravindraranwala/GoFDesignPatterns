package gof.design.patterns.behavioral.visitor;

public class Chassis extends CompositeEquipment {

	public Chassis(String name, double discountPercentage) {
		super(name, discountPercentage);
	}

	@Override
	public double netPrice() {
		return 34.2;
	}

	@Override
	public double discountPrice() {
		final double discountPrice = 34.2 * (100 - this.discountPercentage) / 100;
		return discountPrice;
	}

	@Override
	public void accept(EquipmentVisitor visitor) {
		for (Equipment equipment : equipments)
			equipment.accept(visitor);
		
		visitor.visitChassis(this);
	}

}
