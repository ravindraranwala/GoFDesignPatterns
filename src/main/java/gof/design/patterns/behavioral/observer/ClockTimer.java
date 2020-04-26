package gof.design.patterns.behavioral.observer;

import java.time.LocalTime;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ClockTimer extends Subject {
	private int hour;
	private int minute;
	private int second;
	private ScheduledExecutorService exec = new ScheduledThreadPoolExecutor(1);

	public ClockTimer() {
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
		exec.scheduleAtFixedRate(() -> tick(), 0, 1, TimeUnit.SECONDS);
	}
}
