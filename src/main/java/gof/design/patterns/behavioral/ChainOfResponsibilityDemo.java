package gof.design.patterns.behavioral;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		final Application application = new Application(HelpTopic.APPLICATION_TOPIC);
		final Dialog dialog = new Dialog(application, HelpTopic.PRINT_TOPIC);
		final Button button = new Button(dialog, HelpTopic.PAPER_ORIENTATION_TOPIC);
		button.handleHelp();
	}

}
