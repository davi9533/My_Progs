package week7;

public class Prime {

	public static void main(String[] args) {
		int flag = 0;
		
		for (int i = 1; i <= 200; i++) {
			for (int j = i; j >= 1; j--) {

				if (i % j == 0) {
					flag = flag+ 1;

				}

			}
			if (flag == 2) {
				System.out.print(i);
			}

		}

	}

}
