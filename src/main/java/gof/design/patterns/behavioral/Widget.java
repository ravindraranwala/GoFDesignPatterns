package gof.design.patterns.behavioral;

public class Widget extends HelpHandler {
	private final HelpHandler parent;

	public Widget(HelpHandler parent, HelpTopic topic) {
		super(parent, topic);
		this.parent = parent;
	}
}
