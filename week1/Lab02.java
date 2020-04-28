package week1;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s%s%s%s", "Enter ", "the ", "first ", "number: ");
		float a = sc.nextFloat();
		System.out.printf("%s%s%s%s", "Enter ", "the ", "Second ", "number: ");
		float b = sc.nextFloat();
		float product = a * b;
		float addition = a + b;
		System.out.println("The result of multiplication is " + product);
		System.out.println("The result of addition is: " + addition);

	}

}
