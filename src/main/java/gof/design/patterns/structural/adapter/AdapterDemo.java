package gof.design.patterns.structural.adapter;

public class AdapterDemo {

	public static void main(String[] args) {
		TextView textView = new TextView();
		TextShape textShape = new TextShape(textView);
		textShape.createManipulator().manipulate();
		System.out.println(textShape.isEmpty());
		textShape.boundingBox(new Point(2, 4), new Point(10, 15));
	}

}
