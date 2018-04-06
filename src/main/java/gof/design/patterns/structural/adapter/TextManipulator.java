package gof.design.patterns.structural.adapter;

public class TextManipulator implements Manipulator {
	private final Shape shape;

	public TextManipulator(Shape shape) {
		super();
		this.shape = shape;
	}

	@Override
	public void manipulate() {
		System.out.println("Manipulating TextShape..." + this.shape);
	}

}
