package gof.design.patterns.behavioral;

public class Application extends HelpHandler {

	public Application(HelpTopic topic) {
		super(null, topic);
	}

	@Override
	public void handleHelp() {
		if (this.hasHelp()) {
			// Show a list of help topics.
			System.out.println("Application showing a list of help topics.");
		}
	}

}
