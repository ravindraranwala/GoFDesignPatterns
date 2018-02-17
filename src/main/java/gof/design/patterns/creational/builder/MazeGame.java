package gof.design.patterns.creational.builder;

import gof.design.patterns.creational.abstractfactory.Maze;

public class MazeGame {

	public Maze createMaze(MazeBuilder builder) {
		builder.buildMaze();
		
		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2);
		
		return builder.getMaze();
	}

}
