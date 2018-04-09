package gof.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Base class for equipment that contains other equipments.
public class CompositeEquipment extends Equipment {
	private final List<Equipment> equipments;

	public CompositeEquipment(String name) {
		super(name);
		this.equipments = new ArrayList<>();
	}

	@Override
	public Currency netPrice() {
		final double total = this.equipments.stream().map(Equipment::netPrice).mapToDouble(Currency::getValue).sum();
		return new Currency(total, CurrencyTypes.USD);
	}

	@Override
	public Watt power() {
		final double totalPower = this.equipments.stream().map(Equipment::power).mapToDouble(Watt::getValue).sum();
		return new Watt(totalPower, PowerUnits.WATT);
	}

	@Override
	public void add(Equipment equipment) {
		this.equipments.add(equipment);
	}

	@Override
	public void remove(Equipment equipment) {
		this.equipments.remove(equipment);
	}

}
