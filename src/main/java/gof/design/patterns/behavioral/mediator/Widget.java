package gof.design.patterns.behavioral.mediator;

public abstract class Widget {
	private final DialogDirector director;

	public Widget(DialogDirector director) {
		super();
		this.director = director;
	}

	public void changed() {
		this.director.widgetChanged(this);
	}

	public abstract void handleMouse(MouseEvent event);
}
