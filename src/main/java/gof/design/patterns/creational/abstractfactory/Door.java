package gof.design.patterns.creational.abstractfactory;

public class Door implements Side {
	private final Room roomOne;
	private final Room roomTwo;

	public Door(Room roomOne, Room roomTwo) {
		super();
		this.roomOne = roomOne;
		this.roomTwo = roomTwo;
	}

	@Override
	public void render() {
		System.out.println("Door between room: " + this.roomOne.getNumber() + " and room: " + this.roomTwo.getNumber());
	}
}
