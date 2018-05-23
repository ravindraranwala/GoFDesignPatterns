package gof.design.patterns.behavioral.visitor;

import gof.design.patterns.structural.composite.Currency;
import gof.design.patterns.structural.composite.CurrencyTypes;

public class PricingVisitor implements EquipmentVisitor {
	private double total = 0.0;

	@Override
	public void visitFloppyDisk(FloppyDisk floppyDisk) {
		this.total += floppyDisk.netPrice().getValue();
	}

	@Override
	public void visitCard(Card card) {
		this.total += card.netPrice().getValue();
	}

	@Override
	public void visitChassis(Chassis chassis) {
		this.total += chassis.discountPrice().getValue();
	}

	@Override
	public void visitBus(Bus bus) {
		this.total += bus.discountPrice().getValue();
	}

	public Currency getTotalPrice() {
		return new Currency(this.total, CurrencyTypes.USD);
	}

}
