import java.util.Scanner;
/* write a method that accepts two arguments: an array and a number n. 
 * Assume that the array contains integers. The method should display all 
 * of the numbers in the array that are greater than the number n.*/

public class Ques4 {

	public static void main(String[] args) {
		// declaring a variable n.
		int n;
		// creating object of scanner class to get the user input.
		Scanner s = new Scanner(System.in);
		// declaring an array of size 5.
		int[] arr = new int[5];
		System.out.println("Enter 5 numbers: ");
		// for loop to accept numbers from user and storing them to array.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		// ask user to enter any number.
		System.out.println("Enter any number: ");
		n = s.nextInt();
		// creation of class Ques4 object.
		Ques4 q = new Ques4();
		// passing accepted values to the method greater and calling the method using object of the class to get the output.
		q.greater(arr, n);
	}

	public void greater(int[] array, int n) {
		// for loop to compare the number with values entered in array.
		for (int i = 0; i < array.length; i++) {
			// comparison
			if (array[i] > n) {
				// displaying all greater values
				System.out.print(array[i] + " ");
			}

		}

	}
}
