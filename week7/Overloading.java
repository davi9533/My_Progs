package week7;

public class Overloading {

	public static void main(String[] args) {
		System.out.println("Func1: The max between 3 and 4 is " +max(3.0,4));
		System.out.println("Func2: The max between 3.6 and 4.8 is " +max(3.6,4.8));
		System.out.println("Func3: The max between 9.8, 3.6 and 4.6 is " +max(3.6,4.6,9.8));
	}

	public static int max(int num1, int num2) {
		if (num1 > num2) {
			return num1;

		} else
			return num2;

	}

	public static double max(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else
			return num2;
	}

	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}
}
