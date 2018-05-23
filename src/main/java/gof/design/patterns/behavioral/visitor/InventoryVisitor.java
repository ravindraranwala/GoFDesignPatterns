package gof.design.patterns.behavioral.visitor;

public class InventoryVisitor implements EquipmentVisitor {
	private final Inventory inventory = new Inventory();

	@Override
	public void visitFloppyDisk(FloppyDisk floppyDisk) {
		this.inventory.accumulate(floppyDisk);
	}

	@Override
	public void visitCard(Card card) {
		this.inventory.accumulate(card);
	}

	@Override
	public void visitChassis(Chassis chassis) {
		this.inventory.accumulate(chassis);
	}

	@Override
	public void visitBus(Bus bus) {
		this.inventory.accumulate(bus);
	}

	public Inventory getInventory() {
		return this.inventory;
	}

}
