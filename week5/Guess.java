package week5;

import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = ((int) (Math.random() * 101));
		System.out.println("Enter number between 0 to 100");
		int usn = input.nextInt();
		while (num != usn) {
			if (usn < num) {
				System.out.println(usn + " Number is too low ");
			} else {
				System.out.println(usn + " Number is too high");
			}
			System.out.println("Enter the number again: ");
			usn = input.nextInt();

		}
		System.out.println("Found the match");

	}
}
