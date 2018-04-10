package gof.design.patterns.structural.decorator;

public class Window {
	private VisualComponent contents;

	public VisualComponent getContents() {
		return contents;
	}

	public void setContents(VisualComponent contents) {
		this.contents = contents;
	}

}
