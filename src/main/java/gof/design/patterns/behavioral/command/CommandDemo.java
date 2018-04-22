package gof.design.patterns.behavioral.command;

public class CommandDemo {

	public static void main(String[] args) {
		new OpenCommand(new Application()).execute();
		new PasteCommand(new Document("myDocOne")).execute();
		// final MacroCommand macroCommand = new MacroCommand();
		// macroCommand.add(new OpenCommand(new Application()));
		// macroCommand.add(new PasteCommand(new Document("myDocOne")));
		// macroCommand.execute();
	}

}
