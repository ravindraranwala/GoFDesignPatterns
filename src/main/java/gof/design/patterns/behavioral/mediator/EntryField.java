package gof.design.patterns.behavioral.mediator;

public class EntryField extends Widget {
	private String text;

	public EntryField(DialogDirector director) {
		super(director);
	}

	@Override
	public void handleMouse(MouseEvent event) {
		System.out.println("EntryField was clicked.");
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		System.out.println("Updating the Entry Field's font to: " + text);
		this.text = text;
	}

}
