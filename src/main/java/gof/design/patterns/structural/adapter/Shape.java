package gof.design.patterns.structural.adapter;

// Notice: This is the Target our client expects.
public interface Shape {
	void boundingBox(Point bottomLeft, Point topRight);

	// Notice: Factory method.
	Manipulator createManipulator();
}
