package gof.design.patterns.behavioral.visitor;

public class Card extends Equipment {

	public Card(String name) {
		super(name);
	}

	@Override
	public double netPrice() {
		return 4.2;
	}

	@Override
	public double power() {
		return 1.6;
	}

	@Override
	public void accept(EquipmentVisitor visitor) {
		visitor.visitCard(this);
	}

}
