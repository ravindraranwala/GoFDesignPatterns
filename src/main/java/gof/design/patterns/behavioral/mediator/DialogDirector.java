package gof.design.patterns.behavioral.mediator;

public abstract class DialogDirector {
	abstract void showDialog();

	abstract void widgetChanged(Widget theChangedWidget);

	protected abstract void createWidgets();
}
