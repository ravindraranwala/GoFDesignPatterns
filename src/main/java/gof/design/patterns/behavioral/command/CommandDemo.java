package gof.design.patterns.behavioral.command;

public class CommandDemo {

	public static void main(String[] args) {
		MenuItem openMenu = new MenuItem(new OpenCommand(new Application()));
		MenuItem pasteMenu = new MenuItem(new PasteCommand(new Document("myDocOne")));
		Menu mainMenu = new Menu();
		mainMenu.add(openMenu);
		mainMenu.add(pasteMenu);

		mainMenu.getMenuItems().forEach(MenuItem::clicked);
		// final MacroCommand macroCommand = new MacroCommand();
		// macroCommand.add(new OpenCommand(new Application()));
		// macroCommand.add(new PasteCommand(new Document("myDocOne")));
		// macroCommand.execute();
	}

}
