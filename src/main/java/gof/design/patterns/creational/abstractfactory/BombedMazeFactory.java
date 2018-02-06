package gof.design.patterns.creational.abstractfactory;

public class BombedMazeFactory extends MazeFactory {

	@Override
	public Wall makeWall() {
		return new BombedWall();
	}

	@Override
	public Room makeRoom(int number) {
		return new RoomWithABomb(number);
	}

}
