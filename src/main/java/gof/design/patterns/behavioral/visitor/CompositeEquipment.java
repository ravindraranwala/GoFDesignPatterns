package gof.design.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.Collection;

// Base class for equipment that contains other equipments.
public abstract class CompositeEquipment extends Equipment {
	protected final Collection<Equipment> equipments;
	protected final double discountPercentage;

	protected CompositeEquipment(String name, double discountPercentage) {
		super(name);
		this.equipments = new ArrayList<>();
		this.discountPercentage = discountPercentage;
	}

	public void add(Equipment equipment) {
		this.equipments.add(equipment);
	}

	public void remove(Equipment equipment) {
		this.equipments.remove(equipment);
	}

}
