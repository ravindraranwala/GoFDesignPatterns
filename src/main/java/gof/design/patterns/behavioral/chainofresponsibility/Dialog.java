package gof.design.patterns.behavioral.chainofresponsibility;

public class Dialog extends Widget {

	public Dialog(HelpHandler parent, HelpTopic topic) {
		super(parent, topic);
	}

	@Override
	public void handleHelp() {
		if (this.hasHelp()) {
			// offer help on the dialog.
			System.out.println("Dialog Print Topic is displayed.");
		} else {
			super.handleHelp();
		}
	}

}
