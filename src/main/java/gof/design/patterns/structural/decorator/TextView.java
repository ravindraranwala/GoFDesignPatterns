package gof.design.patterns.structural.decorator;

public class TextView implements VisualComponent {

	@Override
	public void draw() {
		System.out.println("Drawing a Text View.");
	}

}
