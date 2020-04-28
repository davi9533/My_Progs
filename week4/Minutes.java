package week4;

import java.util.Scanner;

public class Minutes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Seconds: ");
		int sec = input.nextInt();
		int min = sec / 60;
		int re_seconds = sec % 60;

		System.out.println("Minutes: " + min + " Seconds: " + re_seconds);
		

	}
}
