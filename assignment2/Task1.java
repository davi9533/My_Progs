package assignment2;

public class Task1 {
	public static void main(String[] args) {
		for (int i = 0; i <= 7; i++) {
			for (int j = 1; j <= 7 - i; j++) {
				System.out.print("\t");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("\t"+ (int) Math.pow(2, k));
			}
			for (int l = i - 1; l >=0; l--) {
				System.out.print("\t"+ (int) Math.pow(2, l));
			}
			System.out.println();

		}
	}
}
