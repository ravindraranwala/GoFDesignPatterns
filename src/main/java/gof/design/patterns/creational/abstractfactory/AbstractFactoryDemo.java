package gof.design.patterns.creational.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		MazeGame game = new MazeGame();
		final Maze aMaze = game.createMaze(new BombedMazeFactory());
		aMaze.render();
	}

}
