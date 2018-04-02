package gof.design.patterns.creational.singleton;

import gof.design.patterns.creational.abstractfactory.Door;
import gof.design.patterns.creational.abstractfactory.Maze;
import gof.design.patterns.creational.abstractfactory.Room;
import gof.design.patterns.creational.abstractfactory.Wall;

public class MazeFactory {
	private static MazeFactory instance;

	private MazeFactory() {

	}

	public static MazeFactory getInstance() {
		// Notice lazy initialization.
		if (instance == null) {
			instance = new MazeFactory();
		}
		return instance;
	}

	public Maze makeMaze() {
		return new Maze();
	}

	public Wall makeWall() {
		return new Wall();
	}

	public Room makeRoom(final int number) {
		return new Room(number);
	}

	public Door makeDoor(final Room roomOne, final Room roomTwo) {
		return new Door(roomOne, roomTwo);
	}
}
