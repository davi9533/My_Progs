package week9;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		System.out.println("Enter radius: ");
		Scanner sc= new Scanner(System.in);
		Class1 c= new Class1();
		Class1 c1= new Class1(6.0);
		c.getRadius();
		c.setRadius(sc.nextDouble());
		System.out.println("Area: "+c1.getArea());
		
		System.out.println(Class1.getNumberofObjects());
		
	}
}
