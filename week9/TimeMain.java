package week9;

public class TimeMain {
	public static void main(String[] args) {
		Time time = new Time();
		System.out.println("Time: \nH: " + time.getHour() + "  M: " + time.getMinute() + "  S: " + time.getSecond());
		Time time2 = new Time(555550000);
		System.out.println("Time: \nH: " + time2.getHour() + "  M: " + time2.getMinute() + "  S: " + time2.getSecond());
		time2.setTime(5647373829L);
		System.out.println("Time: \nH: " + time2.getHour() + "  M: " + time2.getMinute() + "  S: " + time2.getSecond());

	}

}
