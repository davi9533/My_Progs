package assignment1;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		// Task1
		System.out.println("TASK 1");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = input.nextInt();
		int lnum = num / 100;
		int fnum = num % 10;
		if (fnum == lnum) {
			System.out.println(num + " is a Palindrome!!");
		} else {
			System.out.println(num + " is not a Palindrome!!");
		}

		// Task2
		System.out.println("\nTASK 2");
		int r_num = 0;
		System.out.println("Enter 0 for Tail or 1 for Head");
		int user_num = input.nextInt();
		if (Math.random() > 0.5) {
			r_num = 1;
		}
		if (r_num == user_num) {
			System.out.println("Correct");
		} else if (r_num != user_num) {
			System.out.println("Incorrect");
		}

		// Task3
		System.out.println("\nTASK 3");
		double x = (int) ((Math.random() * (51) - 25));
		double y = (int) ((Math.random() * (151) - 75));
		System.out.println("(" + x + "," + y + ")");

		// Task4
		System.out.println("\nTASK 4");
		int x1 = 1, y1 = 1;
		System.out.println("Enter x coordinate: ");
		int x0 = Math.abs(input.nextInt());
		System.out.println("Enter y coordinate: ");
		int y0 = Math.abs(input.nextInt());
		int w = 10, h = 5;

		if (((x0 - x1) <= (w / 2)) && ((y0 - y1) <= (h / 2))) {
			System.out.println(h / 2);
			System.out.println("Coordinate is inside the rectangle");
		} else {
			System.out.println("Coordinate is not inside the rectangle");
		}
	}

}
