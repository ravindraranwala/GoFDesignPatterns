package gof.design.patterns.behavioral.templatemethod;

public abstract class View {
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

	// Notice the prefix do here.
	protected abstract void doDisplay();
}
