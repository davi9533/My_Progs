package week8;

public class TestTV {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(20);
		tv1.setVolume(6);
		tv1.channelUp();
		tv1.channelDown();
		tv1.volumeUp();
		tv1.volumeDown();
		tv1.turnOff();
		tv1.setChannel(100);
		tv1.setVolume(2);
		tv1.turnOn();
		tv1.volumeUp();

	}

}
