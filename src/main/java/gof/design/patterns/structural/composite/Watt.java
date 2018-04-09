package gof.design.patterns.structural.composite;

public class Watt {
	private final double value;
	private final PowerUnits unit;

	public Watt(double value, PowerUnits unit) {
		super();
		this.value = value;
		this.unit = unit;
	}

	public double getValue() {
		return value;
	}

	public PowerUnits getUnit() {
		return unit;
	}
}
