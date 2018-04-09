package gof.design.patterns.structural.composite;

public class CompositeDemo {

	public static void main(String[] args) {
		final Chassis chassis = new Chassis("PC Chassis");
		final Bus bus = new Bus("MCA Bus");
		bus.add(new Card("16Mbs Token Ring"));

		chassis.add(bus);
		chassis.add(new FloppyDisk("3.5in Floppy"));
		System.out.println("The net price is: " + chassis.netPrice());
	}

}
