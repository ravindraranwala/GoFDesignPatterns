package gof.design.patterns.behavioral.command;

// Invoker
public class MenuItem {
	private final Command command;

	public MenuItem(Command command) {
		super();
		this.command = command;
	}

	public void clicked() {
		command.execute();
	}
}
