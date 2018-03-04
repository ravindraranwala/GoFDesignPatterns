package gof.design.patterns.creational.factorymethods;

import gof.design.patterns.creational.abstractfactory.Maze;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		final Maze aMaze = new MazeGame().createMaze();
		aMaze.render();

		final Maze aBombedMaze = new BombedMazeGame().createMaze();
		aBombedMaze.render();
	}

}
