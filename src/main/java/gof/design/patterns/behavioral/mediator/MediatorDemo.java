package gof.design.patterns.behavioral.mediator;

public class MediatorDemo {

	public static void main(String[] args) {
		final DialogDirector director = new FontDialogDirector();
		director.showDialog();
	}

}
