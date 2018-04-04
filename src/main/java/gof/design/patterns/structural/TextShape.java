package gof.design.patterns.structural;

// Object Adapter
public class TextShape implements Shape {
	private final TextView textView;

	public TextShape(TextView textView) {
		super();
		this.textView = textView;
	}

	@Override
	public void boundingBox(Point bottomLeft, Point topRight) {
		System.out.println("Drawing a Text Shape.");
		System.out.println("Bottom: " + bottomLeft.getY() + " Left: " + bottomLeft.getX() + " Width: "
				+ (topRight.getX() - bottomLeft.getX()) + " Height: " + (topRight.getY() - bottomLeft.getY()));
		// Notice: The Delegation.
		this.textView.getOrigin(new Coord(bottomLeft.getY()), new Coord(bottomLeft.getX()));
		this.textView.getExtent(new Coord(topRight.getX() - bottomLeft.getX()),
				new Coord(topRight.getY() - bottomLeft.getY()));
	}

	@Override
	public Manipulator createManipulator() {
		return new TextManipulator(this);
	}

	public boolean isEmpty() {
		return this.textView.isEmpty();
	}

}
