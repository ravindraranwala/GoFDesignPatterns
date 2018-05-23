package gof.design.patterns.behavioral.visitor;

public interface EquipmentVisitor {
	void visitFloppyDisk(FloppyDisk floppyDisk);

	void visitCard(Card card);

	void visitChassis(Chassis chassis);

	void visitBus(Bus bus);
}
