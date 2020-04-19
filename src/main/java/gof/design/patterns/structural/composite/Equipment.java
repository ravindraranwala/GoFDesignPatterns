package gof.design.patterns.structural.composite;

// Defines the Component class.
public class Equipment {
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

	public String name() {
		return name;
	}
}
