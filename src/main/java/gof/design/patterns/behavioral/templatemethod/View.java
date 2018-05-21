package gof.design.patterns.behavioral.templatemethod;

public class View {
	public final void display() {
		setFocus();
		doDisplay();
		resetFocus();
	}

	private void resetFocus() {
		System.out.println("Releasing the drawing state.");
	}

	private void setFocus() {
		System.out.println("Setting up drawing state such as colors and fonts.");
	}

	// Notice the prefix do here. This is the hook operation that performs actual
	// drawing.
	protected void doDisplay() {
		// It does nothing here.
	}
}
