package assignment2;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2012):  ");
		int y = sc.nextInt();
		System.out.print("Enter month: 1-12:  ");
		int m = sc.nextInt();
		System.out.print("Enter the day of the month: 1-31:  ");
		int q = sc.nextInt();
		if (m == 1) {
			m = 13;
			y--;
		} else if (m == 2) {
			m = 14;
			y--;
		}

		switch (m) {

		case 13:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (q > 31) {
				System.out.println("Enter correct day of the month");
			}
			break;

		case 2:
			if (y % 4 == 0) {
				if (q > 29) {
					System.out.println("\nEnter correct day of the month");
				}
			} else if (y % 4 != 0) {
				if (q > 28) {
					System.out.println("\nEnter correct day of the month");
				}
			}
			break;

		case 14:
		case 4:
		case 6:
		case 9:
		case 11:
			if (q > 30) {
				System.out.println("Enter correct day of the month");
			}
			break;

		default:
			System.out.println("Enter valid month");
		}
		int j = y * 100;
		int k = y % 100;
		int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
		
		String[] days = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		switch(h) {
		case 0:
			System.out.println("Day of the week is " +days[0]);
			break;
		case 1:
			System.out.println("Day of the week is " +days[1]);
			break;
		case 2:
			System.out.println("Day of the week is " +days[2]);
			break;
		case 3:
			System.out.println("Day of the week is " +days[3]);
			break;
		case 4:
			System.out.println("Day of the week is " +days[4]);
			break;
		case 5:
			System.out.println("Day of the week is " +days[5]);
			break;
		case 6:
			System.out.println("Day of the week is " +days[6]);
			break;

		}

	}
}
