package week4;

import java.util.Scanner;

public class SalesTax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		double amt = input.nextDouble();
		double tax = amt * 0.06;
		System.out.println("Sales Tax: " + (int)(tax*100));
		

	}

}
