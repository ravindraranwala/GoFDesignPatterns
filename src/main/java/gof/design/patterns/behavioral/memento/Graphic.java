package gof.design.patterns.behavioral.memento;

import gof.design.patterns.structural.adapter.Point;

//base class for graphical objects in the graphical editor
public class Graphic {
	public void move(Point delta) {
		System.out.println("Moving the graphic object by X: " + delta.getX() + " Y: " + delta.getY());
	}
}
