package assignment1;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r_num=0;
		System.out.println("Enter 0 for Tail or 1 for Head");
		int user_num = input.nextInt();
		if( Math.random()>0.5) {
			r_num=1;
		}
		if (r_num == user_num) {
			System.out.println("Correct");
		} 
		else if(r_num != user_num) {
			System.out.println("Incorrect");
		}
		
	}
}
