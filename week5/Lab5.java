package week5;

import java.util.Scanner;

public class Lab5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long st_time = System.currentTimeMillis();
		int i = 0, number1, number2, answer;
		String out = " ";
		while (i < 5) {
			number1 = (int) (Math.random() * 10);
			number2 = (int) (Math.random() * 10);
			if (number1 < number2) {
				number1 = (number1 + number2);
				number2 = (number1 - number2);
				number1 = (number1 - number2);
			}
			System.out.println("What is " + number1 + " - " + number2 + "?");
			answer = in.nextInt();
			if (number1 - number2 == answer) {
				System.out.println("You are correct!");
			} else {
				System.out.println("You are incorrect");
			}

			out += "\n" + (number1 + "-" + number2 + " = " + answer + " is "
					+ (number1 - number2 == answer ? "Correct" : "Wrong"));

			i++;
		}

		long en_time = System.currentTimeMillis();
		System.out.println("Total time in seconds: " + (en_time - st_time) / 1000);
		System.out.println(out);

	}
}
