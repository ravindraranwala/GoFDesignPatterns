package gof.design.patterns.creational.abstractfactory;

public class MazeGame {
	public Maze createMaze(MazeFactory factory) {
		final Maze aMaze = factory.makeMaze();
		final Room roomOne = factory.makeRoom(1);
		final Room roomTwo = factory.makeRoom(2);
		final Door aDoor = factory.makeDoor(roomOne, roomTwo);

		aMaze.addRoom(roomOne);
		aMaze.addRoom(roomTwo);

		roomOne.setSide(DIRECTION.NORTH, factory.makeWall());
		roomOne.setSide(DIRECTION.EAST, aDoor);
		roomOne.setSide(DIRECTION.SOUTH, factory.makeWall());
		roomOne.setSide(DIRECTION.WEST, factory.makeWall());

		roomTwo.setSide(DIRECTION.NORTH, factory.makeWall());
		roomTwo.setSide(DIRECTION.EAST, factory.makeWall());
		roomTwo.setSide(DIRECTION.SOUTH, factory.makeWall());
		roomTwo.setSide(DIRECTION.WEST, aDoor);

		return aMaze;
	}
}
