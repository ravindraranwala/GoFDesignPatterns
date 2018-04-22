package gof.design.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

// No receivers here. Only sub-commands have receivers.
public class MacroCommand implements Command {
	private final List<Command> commands = new ArrayList<>();

	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}

	public void add(Command command) {
		this.commands.add(command);
	}

	public void remove(Command command) {
		this.commands.remove(command);
	}

}
