package week5;

import java.util.Scanner;

public class Zodiac {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		switch (year%12) {
		case 1:
			System.out.println("Monkey");
			break;
		case 2:
			System.out.println("Rooster");
			break;
		case 3:
			System.out.println("Dog");
			break;
		case 4:
			System.out.println("ABC");
			break;
		case 5:
			System.out.println("Rooster");
			break;
		case 6:
			System.out.println("Rooster");
			break;
		case 7:
			System.out.println("Rooster");
			break;
		case 8:
			System.out.println("AXYZ");
			break;
		case 9:
			System.out.println("Rooster");
			break;
		case 10:
			System.out.println("Rooster");
			break;
		case 11:
			System.out.println("AXYZ");
			break;
		default:
			System.out.println("Wrong Input");
			break;
		}
	}
}
