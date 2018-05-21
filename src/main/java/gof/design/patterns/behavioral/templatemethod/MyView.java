
package gof.design.patterns.behavioral.templatemethod;

public class MyView extends View {
	@Override
	protected void doDisplay() {
		System.out.println("Render the view's contents.");
	}
}
