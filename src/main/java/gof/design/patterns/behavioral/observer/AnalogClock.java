package gof.design.patterns.behavioral.observer;

public class AnalogClock implements Widget, Observer {
	private final ClockTimer subject;

	public AnalogClock(ClockTimer subject) {
		super();
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update(Subject theChangedSubject) {
		// overrides Observer operation
		if (this.subject == theChangedSubject) {
			this.draw();
		}
	}

	@Override
	public void draw() {
		// overrides Widget operation
		// defines how to draw the analog clock
		// get the new values from the subject
		final int hour = this.subject.getHour();
		final int minute = this.subject.getMinute();
		final int second = this.subject.getSecond();
		// draw the Analog clock
		System.out.println("Analog Clock -> H: " + hour + " M: " + minute + " S: " + second);
	}

}
