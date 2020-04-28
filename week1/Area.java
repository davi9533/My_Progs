package week1;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
	
		int radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		radius=sc.nextInt();
		final double PI=3.14159;
		double area;
		area= PI*radius*radius;
		System.out.println("Area of the circle is: " +area);
		
	}

}

