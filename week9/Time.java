package week9;

public class Time {

	private int hour;
	private int minute;
	private int second;
	private long cTime;

	public Time() {
		cTime = System.currentTimeMillis();

	}

	public Time(long time) {
		cTime = time;
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(long elapseTime) {
		cTime = elapseTime;
	}

	public int getHour() {
		return (int) ((cTime / (1000 * 60 * 60)) % 24);
	}

	public int getMinute() {
		return (int) (cTime / (1000 * 60)) % 60;
	}

	public int getSecond() {
		return (int) (cTime / 1000) % 60;
	}

}
