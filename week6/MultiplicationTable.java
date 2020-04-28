package week6;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("\t \t \t Multiplication Table");
		for (int i = 1; i <= 9; i++) {
			System.out.print("\t" + i);
		}
		System.out.println("\n---------------------------------------------------------------------------------");
		for (int j = 1; j <= 9; j++) {
			System.out.print(j + "|");
			for (int k = 1; k <= 9; k++) {
				System.out.printf("\t%d", k * j);
			}
			System.out.println();
		}

	}

}
