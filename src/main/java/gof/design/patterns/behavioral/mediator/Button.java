package gof.design.patterns.behavioral.mediator;

public class Button extends Widget {
	private String text;

	public Button(DialogDirector director) {
		super(director);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public void handleMouse(MouseEvent event) {
		System.out.println(this.text + " button is clicked.");
		this.changed();
	}

}
