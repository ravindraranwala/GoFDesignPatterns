package gof.design.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

import gof.design.patterns.structural.composite.Currency;
import gof.design.patterns.structural.composite.CurrencyTypes;
import gof.design.patterns.structural.composite.PowerUnits;
import gof.design.patterns.structural.composite.Watt;

// Base class for equipment that contains other equipments.
public abstract class CompositeEquipment extends Equipment {
	protected final List<Equipment> equipments;
	private final double discountPercentage;

	public CompositeEquipment(String name, double discountPercentage) {
		super(name);
		this.equipments = new ArrayList<>();
		this.discountPercentage = discountPercentage;
	}

	@Override
	public Currency netPrice() {
		final double total = this.equipments.stream().map(Equipment::netPrice).mapToDouble(Currency::getValue).sum();
		return new Currency(total, CurrencyTypes.USD);
	}

	@Override
	public Currency discountPrice() {
		final double total = this.equipments.stream().map(Equipment::netPrice).mapToDouble(Currency::getValue).sum();
		return new Currency(total * (100 - this.discountPercentage) / 100, CurrencyTypes.USD);
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
