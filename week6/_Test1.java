package week6;

import java.util.Scanner;

public class _Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		System.out.println("Maximum number: " + max(n1, n2));
	}

	public static int max(int n1, int n2) {
		int result;
		if (n1 < n2) {
			result = n2;
		} else {
			result = n1;
		}
		return result;

	}
}
