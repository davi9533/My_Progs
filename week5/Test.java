package week5;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an int value: ");
		int data = in.nextInt();
		
		int sum =0;
		while(data!=0) {
			sum+=data;
			System.out.println("Enter int val: ");
			data= in.nextInt();
		}System.out.println("Sum: "+sum);
		
	}
}
