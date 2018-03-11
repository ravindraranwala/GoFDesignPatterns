package gof.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Maze {
	private List<Room> rooms = new ArrayList<>();

	// Notice: The copy constructor.
	private Maze(final Maze other) {
		this.rooms = other.rooms;
	}

	public Maze() {
		super();
	}

	public void render() {
		System.out.println("Maze");
		System.out.println("Printing room details of this maze.");
		this.rooms.stream().forEach(room -> room.render());
	}

	public void addRoom(final Room room) {
		this.rooms.add(room);
	}

	public boolean roomExist(final int roomNumber) {
		return this.rooms.stream().filter(room -> room.getNumber() == roomNumber).count() >= 1;
	}

	public Room getRoomByNumber(int roomNumber) {
		return this.rooms.stream().filter(room -> room.getNumber() == roomNumber).findFirst()
				.orElseThrow(NullPointerException::new);
	}

	public Maze clone() {
		return new Maze(this);
	}
}
