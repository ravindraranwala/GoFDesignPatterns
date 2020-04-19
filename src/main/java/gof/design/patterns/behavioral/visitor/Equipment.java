package gof.design.patterns.behavioral.visitor;

public abstract class Equipment {
	private final String name;

	public Equipment(String name) {
		super();
		this.name = name;
	}

	public double netPrice() {
		return 0.0;
	}

	public double power() {
		return 0.0;
	}

	public double discountPrice() {
		throw new UnsupportedOperationException();
	}
	
	public String getName() {
		return name;
	}

	public abstract void accept(EquipmentVisitor visitor);
}
