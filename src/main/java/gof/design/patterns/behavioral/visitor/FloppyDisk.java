package gof.design.patterns.behavioral.visitor;

// Leaf class.
public class FloppyDisk extends Equipment {

	public FloppyDisk(String name) {
		super(name);
	}

	@Override
	public double netPrice() {
		return 1.8;
	}

	@Override
	public double power() {
		return 2.2;
	}

	@Override
	public void accept(EquipmentVisitor visitor) {
		visitor.visitFloppyDisk(this);
	}

}
