package gof.design.patterns.behavioral.visitor;

import gof.design.patterns.structural.composite.Currency;
import gof.design.patterns.structural.composite.CurrencyTypes;
import gof.design.patterns.structural.composite.PowerUnits;
import gof.design.patterns.structural.composite.Watt;

public class Card extends Equipment {

	public Card(String name) {
		super(name);
	}

	@Override
	public Currency netPrice() {
		return new Currency(4.2, CurrencyTypes.USD);
	}

	@Override
	public Watt power() {
		return new Watt(1.6, PowerUnits.WATT);
	}

	@Override
	public void accept(EquipmentVisitor visitor) {
		visitor.visitCard(this);
	}

}
