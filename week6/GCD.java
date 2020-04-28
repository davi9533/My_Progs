package week6;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int n2 = sc.nextInt();
		int gcd = 1;
		int k = 2;
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}

			k++;
		}

		System.out.println("GCD: " + gcd);

	}
}
