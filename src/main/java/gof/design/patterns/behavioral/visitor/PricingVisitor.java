package gof.design.patterns.behavioral.visitor;

/**
 * Computes the cost of the equipment structure. It computes the net price of
 * all simple equipments (e.g., floppies) and the discount price of all
 * composite equipment (e.g., chassis and busses)
 * 
 * @author ravindra
 *
 */
public class PricingVisitor implements EquipmentVisitor {
	private double total = 0.0;

	@Override
	public void visitFloppyDisk(FloppyDisk floppyDisk) {
		this.total += floppyDisk.netPrice();
	}

	@Override
	public void visitCard(Card card) {
		this.total += card.netPrice();
	}

	@Override
	public void visitChassis(Chassis chassis) {
		this.total += chassis.discountPrice();
	}

	@Override
	public void visitBus(Bus bus) {
		this.total += bus.discountPrice();
	}

	public double getTotalPrice() {
		return this.total;
	}

}
