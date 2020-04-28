package week8;

public class TV {

	int channel = 1;
	int volumeLevel = 1;
	boolean on = true;

	public TV() {

	}

	public void turnOn() 
	{
		on = true;
		System.out.println("TV is On");

	}

	public void turnOff()
	{
		on = false;
		System.out.println("TV is Off");
	}

	public void setChannel(int newChannel)
	{
		if (on == false) {
			System.out.println("TV is Off,Please turn on the TV");
		} else if (newChannel > 1 && newChannel < 120) {
			channel = newChannel;
			System.out.println("Channel No: " + channel);
		}
	}

	public void setVolume(int newVolumeLevel)
	{
		if (on == false) 
		{
			System.out.println("TV is Off,Please turn on the TV");
		} else if (newVolumeLevel >= 1 && newVolumeLevel <= 7) 
		{
			volumeLevel = newVolumeLevel;
			System.out.println("Volume Level: " + volumeLevel);
		}

	}

	public void channelUp()
	{
		if (on == true && channel < 120) 
		{
			channel++;
			System.out.println("Channel No: " + channel);
		} else {
			System.out.println("TV is Off,Please turn on the TV");
		}
	}

	public void channelDown() 
	{
		if (on == true && channel > 1) 
		{
			channel--;
			System.out.println("Channel No: " + channel);
		} else {
			System.out.println("TV is Off,Please turn on the TV");
		}
	}

	public void volumeUp()
	{
		if (on == true && volumeLevel < 7)
		{
			volumeLevel++;
			System.out.println("Volume Level: " + volumeLevel);
		} else {
			System.out.println("TV is Off,Please turn on the TV");
		}
	}
	
	public void volumeDown() 
	{
		if (on == true && volumeLevel > 1)
		{
			volumeLevel--;
			System.out.println("Volume Level: " + volumeLevel);
		} else {
			System.out.println("TV is Off,Please turn on the TV");
		}

	}

}
