package week4;

import java.util.Scanner;

public class MathProb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() % 10);
		System.out.println("What is" + number1 + "+" + number2 + "?");
		int answer = in.nextInt();
		System.out.println(number1 + "+" + number2 + " = " + answer + "is" + (number1 + number2 == answer));

	}
}
