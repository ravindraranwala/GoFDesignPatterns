package gof.design.patterns.creational.builder;

import java.util.List;

import gof.design.patterns.creational.abstractfactory.Maze;

public class BuilderDemo {

	public static void main(String[] args) {
		MazeGame game = new MazeGame();
		StandardMazeBuilder builder = new StandardMazeBuilder();
		final Maze aMaze = game.createMaze(builder);
		aMaze.render();

		final CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
		game.createMaze(countingMazeBuilder);
		List<Integer> roomAndDoorCount = countingMazeBuilder.getCounts();
		System.out.println(
				"The Maze has " + roomAndDoorCount.get(0) + " rooms and " + roomAndDoorCount.get(1) + " doors");
	}

}
