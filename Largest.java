import java.util.Scanner;

/*Write a program that reads four integers from the user 
 * and outputs the largest and second-largest among them.*/
public class Largest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int temp;
		int[] number = new int[4]; // declaring an array of length 4.
		int len = number.length; // storing length of array to len.

		// Accepting four integers from user.
		System.out.println("Enter four integers");
		// storing accepted values in array.
		for (int i = 0; i < len; i++) {
			number[i] = s.nextInt();
		}
		// comparing values of array number

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {

				// sorting the array number in ascending order
				if (number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		System.out.println("Largest numberber is " + number[len - 1]);
		System.out.println("Second-largest number is " + number[len - 2]);
	}

}
