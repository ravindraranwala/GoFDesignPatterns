package gof.design.patterns.behavioral.visitor;

import gof.design.patterns.structural.composite.Currency;
import gof.design.patterns.structural.composite.CurrencyTypes;
import gof.design.patterns.structural.composite.PowerUnits;
import gof.design.patterns.structural.composite.Watt;

// Leaf class.
public class FloppyDisk extends Equipment {

	public FloppyDisk(String name) {
		super(name);
	}

	@Override
	public Currency netPrice() {
		return new Currency(1.8, CurrencyTypes.USD);
	}

	@Override
	public Watt power() {
		return new Watt(2.2, PowerUnits.WATT);
	}

	@Override
	public void accept(EquipmentVisitor visitor) {
		visitor.visitFloppyDisk(this);
	}

}
