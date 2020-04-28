package assignment3;

import java.util.Random;
import java.util.Scanner;

public class Ques3 {
	public static void main(String[] args) {
		String guess;
		String str = "";
		Scanner sc = new Scanner(System.in);

		String[] dictionary = { "banana", "fruit", "exotic", "apple", "grapes", "sharpner", "pencil", "eraser", "mango",
				"lemon", "teddy", "lovely", "purple", "beans", "green", "orange", "black", "yellow", "white",
				"papaya" };

		int r = new Random().nextInt(dictionary.length);

		String word = dictionary[r];
		// System.out.println(word);

		char[] chars = dictionary[r].toCharArray();
		for (int i = 0; i < word.length(); i++) {

			chars[i] = '_';
			System.out.print(chars[i] + " ");
		}
		while (!str.equals(word)) {

			// for (int x = 0; x < word.length(); x++) {

			System.out.println("\n\nGuess a letter: ");
			guess = sc.nextLine();
			char g = guess.charAt(0);
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == g) {
					chars[i] = g;

				}
				System.out.print(chars[i] + " ");

			}
			str = String.valueOf(chars);
			//System.out.println(str);

		}
		System.out.println("\n(yay you guessed it)");

	}

}
