package week6;

import java.util.Scanner;

public class Lab05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int n2 = sc.nextInt();

		System.out.println("Greatest Common Divisor of " + n1 + " and " + n2 + " is: " + gcd(n1, n2));

	}

	public static int gcd(int a, int b) {
		int gcd = 1;
		int k = 2;
		while (k <= a && k <= b) {
			if (a % k == 0 && b % k == 0) {
				gcd = k;
			}

			k++;
		}
		return gcd;
	}

}
