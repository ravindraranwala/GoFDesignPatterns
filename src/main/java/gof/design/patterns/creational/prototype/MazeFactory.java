package gof.design.patterns.creational.prototype;

public class MazeFactory {
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
