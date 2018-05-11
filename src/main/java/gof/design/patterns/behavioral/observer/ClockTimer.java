package gof.design.patterns.behavioral.observer;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class ClockTimer extends Subject {
	private int hour;
	private int minute;
	private int second;

	public ClockTimer() {
		super();
		this.startTimer();
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getSecond() {
		return this.second;
	}

	private void tick() {
		// update internal time-keeping state
		LocalTime time = LocalTime.now();
		this.hour = time.getHour();
		this.minute = time.getMinute();
		this.second = time.getSecond();
		// And then notify the observers.
		this.notifyObservers();
	}

	private void startTimer() {
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				tick();
			}
		}, 0, 1000);
	}
}
