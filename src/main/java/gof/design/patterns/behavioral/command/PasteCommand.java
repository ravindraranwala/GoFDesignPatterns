package gof.design.patterns.behavioral.command;

public class PasteCommand implements Command {
	private final Document document;

	public PasteCommand(Document document) {
		super();
		this.document = document;
	}

	@Override
	public void execute() {
		this.document.paste();
	}

}
