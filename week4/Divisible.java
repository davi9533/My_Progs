package week4;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = in.nextInt();
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("Number " + num + " is divisible by 2 & 3 both");
		} else if (num % 2 == 0 || num % 3 == 0) {
			System.out.println("Number " + num + " is divisible by 2 or 3");
		} else if ((num % 2 == 0) ^ (num % 3 == 0)){
			System.out.println("Number " + num + " is not divisible by 2 & 3 both ");
		}
	}
}
