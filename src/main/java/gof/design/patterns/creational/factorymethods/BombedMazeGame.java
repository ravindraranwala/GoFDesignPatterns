package gof.design.patterns.creational.factorymethods;

import gof.design.patterns.creational.abstractfactory.BombedWall;
import gof.design.patterns.creational.abstractfactory.Room;
import gof.design.patterns.creational.abstractfactory.RoomWithABomb;
import gof.design.patterns.creational.abstractfactory.Wall;

public class BombedMazeGame extends MazeGame {

	@Override
	public Room makeRoom(int number) {
		return new RoomWithABomb(number);
	}

	@Override
	public Wall makeWall() {
		return new BombedWall();
	}

}
