package assignment3;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your status:\n1.Single Filers \n2.Married Filing Jointly or Qualifying Widow(er)"
				+ "\n3.Married Filing Separately \n4.Head of Household");
		int choice = sc.nextInt();
		System.out.println("Enter your taxable income: ");
		double income = sc.nextDouble();
		inTax(choice, income);
	}

	public static void inTax(int choice, double income) {
		double tax = 0;
		switch (choice) {
		// single filers
		case 1:
			tax += (income <= 8350) ? income * 0.10 : 8350 * 0.10;
			if (income > 8350)
				tax += (income <= 33950) ? (income - 8350) * 0.15 : 25600 * 0.15;
			if (income > 33950)
				tax += (income <= 82250) ? (income - 33950) * 0.25 : 48300 * 0.25;
			if (income > 82250)
				tax += (income <= 171550) ? (income - 82250) * 0.28 : 89300 * 0.28;
			if (income > 171550)
				tax += (income <= 372950) ? (income - 171550) * 0.33 : 201400 * 0.33;
			if (income > 372950)
				tax += (income - 372950) * 0.35;
			break;

		// Married file jointly/widow(er)
		case 2:
			tax += (income <= 16700) ? income * 0.10 : 16700 * 0.10;
			if (income > 16700)
				tax += (income <= 67900) ? (income - 16700) * 0.15 : (67900 - 16700) * 0.15;
			if (income > 67900)
				tax += (income <= 137050) ? (income - 67900) * 0.25 : (137050 - 67900) * 0.25;
			if (income > 137050)
				tax += (income <= 208850) ? (income - 137050) * 0.28 : (208850 - 137050) * 0.28;
			if (income > 208850)
				tax += (income <= 372950) ? (income - 208850) * 0.33 : (372950 - 208850) * 0.33;
			if (income > 372950)
				tax += (income - 372950) * 0.35;
			break;
		// married separately
		case 3:
			tax += (income <= 8350) ? income * 0.10 : 8350 * 0.10;
			if (income > 8350)
				tax += (income <= 33950) ? (income - 8350) * 0.15 : (33950 - 8350) * 0.15;
			if (income > 33950)
				tax += (income <= 68525) ? (income - 33950) * 0.25 : (68525 - 33950) * 0.25;
			if (income > 68525)
				tax += (income <= 104425) ? (income - 68525) * 0.28 : (104425 - 68525) * 0.28;
			if (income > 104425)
				tax += (income <= 186475) ? (income - 104425) * 0.33 : (186475 - 104425) * 0.33;
			if (income > 186475)
				tax += (income - 186475) * 0.35;
			break;

		// head of household
		case 4:
			tax += (income <= 11950) ? income * 0.10 : 11950 * 0.10;
			if (income > 11950)
				tax += (income <= 45500) ? (income - 11950) * 0.15 : (45500 - 11950) * 0.15;
			if (income > 45500)
				tax += (income <= 117450) ? (income - 45500) * 0.25 : (117450 - 45500) * 0.25;
			if (income > 117450)
				tax += (income <= 190200) ? (income - 117450) * 0.28 : (190200 - 117450) * 0.28;
			if (income > 190200)
				tax += (income <= 372950) ? (income - 190200) * 0.33 : (372950 - 190200) * 0.33;
			if (income > 372950)
				tax += (income - 372950) * 0.35;
			break;

		default:
			System.out.println("Error: invalid status");

		}

		System.out.println("Tax is " + (int) (tax * 100) / 100.0);
	}

}
