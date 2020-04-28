package week6;

public class _Test2 {
	public static void main(String[] args) {
		System.out.print("Your grade is : ");
		printGrade(85.8);
	}

	public static void printGrade(double score) {
		if (score >= 90.0) {
			System.out.println('A');
		} else if (score >= 80.0) {
			System.out.println('B');
		} else if (score >= 70.0) {
			System.out.println('C');
		} else if (score >= 60) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
	}

}
