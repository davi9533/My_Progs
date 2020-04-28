package week5;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double w = in.nextDouble();
		System.out.println("Enter height in inches: ");
		double h= in.nextDouble();
		final double POUND_TO_KG=0.45359237;
		final double INCH_TO_METRE =0.0254;
		double weight = w*POUND_TO_KG;
		double height = h*INCH_TO_METRE;
		double bmi = (weight/(height*height))*10;
		System.out.println("Your BMI in KG/M is "+bmi);
		if(bmi<18.5) {
			System.out.println("Underweight");
		}
		else if (bmi<25.00) {
			System.out.println("Normal");
		}
		else if(bmi>30.00) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
	}

}
