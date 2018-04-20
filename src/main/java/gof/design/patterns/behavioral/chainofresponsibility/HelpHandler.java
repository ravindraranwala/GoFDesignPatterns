package gof.design.patterns.behavioral.chainofresponsibility;

public class HelpHandler {
	private HelpHandler successor;
	private HelpTopic topic;

	public HelpHandler(HelpHandler successor, HelpTopic topic) {
		super();
		this.setHandler(successor, topic);
	}

	public final boolean hasHelp() {
		return this.topic != HelpTopic.NO_HELP_TOPIC;
	}

	public final void setHandler(HelpHandler handler, HelpTopic topic) {
		this.successor = handler;
		this.topic = topic;
	}

	public void handleHelp() {
		if (this.successor != null) {
			this.successor.handleHelp();
		}
	}
}
