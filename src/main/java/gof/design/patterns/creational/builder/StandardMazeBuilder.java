package gof.design.patterns.creational.builder;

import gof.design.patterns.creational.abstractfactory.DIRECTION;
import gof.design.patterns.creational.abstractfactory.Door;
import gof.design.patterns.creational.abstractfactory.Maze;
import gof.design.patterns.creational.abstractfactory.Room;
import gof.design.patterns.creational.abstractfactory.Wall;

public class StandardMazeBuilder extends MazeBuilder {
	private Maze currentMaze;

	public StandardMazeBuilder() {
		super();
		this.currentMaze = null;
	}

	@Override
	public void buildMaze() {
		this.currentMaze = new Maze();
	}

	@Override
	public void buildRoom(int roomNumber) {
		if (!this.currentMaze.roomExist(roomNumber)) {
			final Room room = new Room(roomNumber);
			currentMaze.addRoom(room);

			room.setSide(DIRECTION.NORTH, new Wall());
			room.setSide(DIRECTION.SOUTH, new Wall());
			room.setSide(DIRECTION.EAST, new Wall());
			room.setSide(DIRECTION.WEST, new Wall());
		}
	}

	@Override
	public void buildDoor(int fromRoom, int toRoom) {
		final Room roomOne = this.currentMaze.getRoomByNumber(fromRoom);
		final Room roomTwo = this.currentMaze.getRoomByNumber(toRoom);
		Door door = new Door(roomOne, roomTwo);
		
		roomOne.setSide(this.commonWall(roomOne, roomTwo), door);
		roomTwo.setSide(this.commonWall(roomTwo, roomOne), door);
	}

	@Override
	public Maze getMaze() {
		return this.currentMaze;
	}

	private DIRECTION commonWall(Room roomOne, Room roomTwo) {
		// TODO: Can implement a real logic later.
		if (roomOne.getNumber() < roomTwo.getNumber()) {
			return DIRECTION.EAST;
		}
		return DIRECTION.WEST;
	}

}
