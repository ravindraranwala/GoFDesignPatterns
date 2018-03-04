package gof.design.patterns.creational.factorymethods;

import gof.design.patterns.creational.abstractfactory.DIRECTION;
import gof.design.patterns.creational.abstractfactory.Door;
import gof.design.patterns.creational.abstractfactory.Maze;
import gof.design.patterns.creational.abstractfactory.Room;
import gof.design.patterns.creational.abstractfactory.Wall;

public class MazeGame {

	public Maze createMaze() {
		final Maze aMaze = this.makeMaze();

		final Room roomOne = this.makeRoom(1);
		final Room roomTwo = this.makeRoom(2);
		final Door theDoor = this.makeDoor(roomOne, roomTwo);

		aMaze.addRoom(roomOne);
		aMaze.addRoom(roomTwo);

		roomOne.setSide(DIRECTION.NORTH, makeWall());
		roomOne.setSide(DIRECTION.EAST, theDoor);
		roomOne.setSide(DIRECTION.SOUTH, makeWall());
		roomOne.setSide(DIRECTION.WEST, makeWall());

		roomTwo.setSide(DIRECTION.NORTH, makeWall());
		roomTwo.setSide(DIRECTION.EAST, makeWall());
		roomTwo.setSide(DIRECTION.SOUTH, makeWall());
		roomTwo.setSide(DIRECTION.WEST, theDoor);

		return aMaze;
	}

	// Factory methods, with their default implementations.
	public Maze makeMaze() {
		return new Maze();
	}

	public Room makeRoom(final int number) {
		return new Room(number);
	}

	public Wall makeWall() {
		return new Wall();
	}

	public Door makeDoor(final Room r1, final Room r2) {
		return new Door(r1, r2);
	}
}
