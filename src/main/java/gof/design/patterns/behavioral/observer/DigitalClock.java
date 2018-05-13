package gof.design.patterns.behavioral.observer;

public class DigitalClock implements Widget, Observer {
	private final ClockTimer subject;

	public DigitalClock(ClockTimer subject) {
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
		// defines how to draw the digital clock
		// get the new values from the subject
		final int hour = this.subject.getHour();
		final int minute = this.subject.getMinute();
		final int second = this.subject.getSecond();
		// draw the digital clock
		System.out.println("Digital Clock -> H: " + hour + " M: " + minute + " S: " + second);
	}

}
