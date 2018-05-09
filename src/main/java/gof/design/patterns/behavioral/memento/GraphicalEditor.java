package gof.design.patterns.behavioral.memento;

import gof.design.patterns.structural.adapter.Point;

public class GraphicalEditor {

	public static void main(String[] args) {
		final MoveCommand moveCmd = new MoveCommand(new Graphic(), new Point(2, 8));
		moveCmd.execute();
		moveCmd.unexecute();
	}

}
