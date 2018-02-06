package gof.design.patterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class Room {
	private final int number;
	private final Map<DIRECTION, Side> sides;

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

}
