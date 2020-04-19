package gof.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.Collection;

// Base class for equipment that contains other equipments.
public class CompositeEquipment extends Equipment {
	private final Collection<Equipment> equipments;

	public CompositeEquipment(String name) {
		super(name);
		this.equipments = new ArrayList<>();
	}

	@Override
	public double netPrice() {
		double total = 0.0;
		for (Equipment equipment : equipments)
			total += equipment.netPrice();

		return total;
	}

	@Override
	public double power() {
		double total = 0.0;
		for (Equipment equipment : equipments)
			total += equipment.power();

		return total;
	}

	public void add(Equipment equipment) {
		this.equipments.add(equipment);
	}

	public void remove(Equipment equipment) {
		this.equipments.remove(equipment);
	}
}
