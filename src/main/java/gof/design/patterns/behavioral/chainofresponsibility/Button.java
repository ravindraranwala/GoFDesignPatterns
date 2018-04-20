package gof.design.patterns.behavioral.chainofresponsibility;

public class Button extends Widget {

	public Button(Widget parent, HelpTopic topic) {
		super(parent, topic);
	}

	@Override
	public void handleHelp() {
		if (this.hasHelp()) {
			// offer help on the button.
			System.out.println("Button Print Orientation Topic is displayed.");
		} else {
			super.handleHelp();
		}
	}

}
