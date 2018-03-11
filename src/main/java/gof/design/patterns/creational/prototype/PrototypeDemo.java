package gof.design.patterns.creational.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		final MazePrototypeFactory simpleMazeFactory = new MazePrototypeFactory(new Maze(), new Room(1), new Wall(), new Door(null, null));
		MazeGame game = new MazeGame();
		final Maze aMaze = game.createMaze(simpleMazeFactory);
		aMaze.render();
	}

}
