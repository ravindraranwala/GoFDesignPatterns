package gof.design.patterns.creational.prototype;

public class Door implements Side {
	private Room roomOne;
	private Room roomTwo;

	// Notice: The Copy constructor.
	private Door(final Door other) {
		this.roomOne = other.roomOne;
		this.roomTwo = other.roomTwo;
	}

	public Door(final Room roomOne, final Room roomTwo) {
		super();
		this.roomOne = roomOne;
		this.roomTwo = roomTwo;
	}

	@Override
	public void render() {
		System.out.println("Door between room: " + this.roomOne.getNumber() + " and room: " + this.roomTwo.getNumber());
	}

	public void initialize(final Room r1, final Room r2) {
		this.roomOne = r1;
		this.roomTwo = r2;
	}

	@Override
	public Door clone() {
		return new Door(this);
	}

}
