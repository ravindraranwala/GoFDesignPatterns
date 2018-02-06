package gof.design.patterns.creational.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class Maze {
	private final List<Room> rooms = new ArrayList<>();

	public void render() {
		System.out.println("Maze");
		System.out.println("Printing room details of this maze.");
		this.rooms.stream().forEach(room -> room.render());
	}

	public void addRoom(final Room room) {
		this.rooms.add(room);
	}
}
