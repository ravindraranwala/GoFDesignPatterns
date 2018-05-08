package gof.design.patterns.behavioral.memento;

import gof.design.patterns.structural.adapter.Point;

public class MementoDemo {

	public static void main(String[] args) {
		final MoveCommand moveCmd = new MoveCommand(new Point(2, 8), new Graphic());
		moveCmd.execute();
		moveCmd.unexecute();
	}

}
