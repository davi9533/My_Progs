package assignment3;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of customer you want to add: ");
		int limit = sc.nextInt();
		Restaurant r = new Restaurant();
		for (int i = 0; i < limit; i++) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter Name");
			String name = sc1.nextLine();
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter Purchase Amount");
			double purchaseAmount = sc2.nextDouble();

			r.addSale(name, purchaseAmount);
		}
		Customer bestCustomer = r.BestCustomer();
		if (bestCustomer != null)
			System.out.println(bestCustomer.toString());
		else
			System.out.println("No Customer");

	}
}