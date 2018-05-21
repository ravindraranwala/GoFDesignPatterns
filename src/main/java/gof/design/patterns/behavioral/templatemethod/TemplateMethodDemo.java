package gof.design.patterns.behavioral.templatemethod;

public class TemplateMethodDemo {
	public static void main(String[] args) {
		final View myView = new MyView();
		myView.display();
	}
}
