package gof.design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

import gof.design.patterns.creational.abstractfactory.DIRECTION;

public class Room {
	private int number;
	private final Map<DIRECTION, Side> sides;

	// Notice: the copy constructor.
	private Room(final Room other) {
		this.number = other.number;
		/*
		 * Beware: Copying a reference here. Deep clone vs Shallow decision has to be
		 * made. Otherwise this would cause very subtle errors in your apps. This kind
		 * of sharing can be dangerous.
		 */
		this.sides = new HashMap<>();
	}

	public Room(int number) {
		super();
		this.number = number;
		sides = new HashMap<>();
	}

	public void render() {
		System.out.println("Room No: " + this.number + " Sides: ");
		sides.keySet().stream().forEach(side -> {
			System.out.print(side.name() + " has a " + " ");
			sides.get(side).render();
		});
	}

	public int getNumber() {
		return number;
	}

	public void setSide(final DIRECTION direction, final Side side) {
		this.sides.put(direction, side);
	}

	public Room clone() {
		return new Room(this);
	}

	public void initialize(final int roomNumber) {
		this.number = roomNumber;
	}
}
