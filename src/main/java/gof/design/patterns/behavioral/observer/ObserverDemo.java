package gof.design.patterns.behavioral.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		final ClockTimer clock = new ClockTimer();
		AnalogClock analogClock = new AnalogClock(clock);
		DigitalClock digitalClock = new DigitalClock(clock);
	}

}
