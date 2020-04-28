import java.util.Scanner;
/*Design and implement an application that reads an integer value representing a year from the user. The purpose of the program is to determine if the year is a leap year
 *  (and therefore has 29 days in February) in the Gregorian calendar. A year is a leap year if it is divisible by 4, unless it is also divisible by 100 but not 400.
For example, the year 2003 is not a leap year, but 2004 is. The year 1900 is not a leap year because it is divisible by 100, but the year 2000 is a leap year because
 even though it is divisible by 100, it is also divisible by 400. Produce an error message for any input value less than 1582*/

public class LeapYear {
	public static void main(String[] args) {
		int year;

		Scanner sc = new Scanner(System.in); // scanner object

		// Accepting value of year from user
		System.out.print("Enter a value of an year: ");
		year = sc.nextInt();
		// if the value of year is less than 1582, it asks user to enter value greater
		// than 1582
		if (year < 1582) {
			System.out.println("Enter year greater than 1582.");
		}
		// if year is divisible by 4 and not divisible by 400 and 100 both, then it is a
		// leap year
		else if ((year % 4 == 0) && (year % 400 != 0 && year % 100 != 0)) {
			System.out.println(year + " is a leap year.");

		}
		// if year is divisible by 4 and not divisible by 100 and divisible by 400, then
		// it is a leap year
		else if ((year % 4 == 0 && year % 100 != 0) && year % 400 == 0) {
			System.out.println(year + " is a leap year.");
		}
		// else the year is not a leap year.
		else {
			System.out.println(year + " is not a leap year.");
		}

	}
}
