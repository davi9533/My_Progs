package assignment1;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = 1, y = 1;
		System.out.println("Enter x coordinate: ");
		int x0 = Math.abs(in.nextInt());
		System.out.println("Enter y coordinate: ");
		int y0 = Math.abs(in.nextInt());
		int w = 10, h = 5;

		if (((x0 - x) <= (w / 2)) && ((y0 - y) <= (h / 2))) {
			System.out.println(h/2);
			System.out.println("Coordinate is inside the rectangle");
		} else {
			System.out.println("Coordinate is not inside the rectangle");
		}

	}
}
