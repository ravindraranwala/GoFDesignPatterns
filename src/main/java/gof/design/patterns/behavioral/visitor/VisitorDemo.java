package gof.design.patterns.behavioral.visitor;

public class VisitorDemo {

	public static void main(String[] args) {
		final Chassis chassis = new Chassis("PC Chassis", 10);
		final Bus bus = new Bus("MCA Bus", 8);
		bus.add(new Card("16Mbs Token Ring"));

		chassis.add(bus);
		chassis.add(new FloppyDisk("3.5in Floppy"));
		final InventoryVisitor inventoryVisitor = new InventoryVisitor();
		chassis.accept(inventoryVisitor);
		System.out.println("Inventory " + chassis.getName() + inventoryVisitor.getInventory());
		
		final PricingVisitor pricingVisitor = new PricingVisitor();
		chassis.accept(pricingVisitor);
		System.out.println(String.format("Total price is: %f", pricingVisitor.getTotalPrice()));
	}

}
