package gof.design.patterns.behavioral.command;

import java.util.Scanner;

public class OpenCommand implements Command {
	private final Application application;

	public OpenCommand(Application application) {
		super();
		this.application = application;
	}

	@Override
	public void execute() {
		final String name = this.askUser();
		if (name != null) {
			final Document document = new Document(name);
			this.application.add(document);
			document.open();
		}
	}

	private String askUser() {
		System.out.println("Enter the document name: ");
		try (Scanner scanner = new Scanner(System.in)) {
			return scanner.nextLine();
		}

	}

}
