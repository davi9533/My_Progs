package assignment3;

import java.util.Scanner;

public class Restaurant {
	
	Customer[] c = new Customer[10];
	
	Scanner sc = new Scanner(System.in);
	
	public void addSale(String nam,double purAm) {
		
		if (c.length == 0) {
			Customer customer = new Customer(nam, purAm);
			c[0] = customer;
		} else {
			for (int i = 0; i < c.length; i++) {
				if (c[i] == null) {
					c[i] = new Customer(nam, purAm);
					break;
				}
			}
		}
	}
	
	
	public Customer BestCustomer() {
		Customer bestCustomer = null;
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null) {
				if (i == 0) {
					bestCustomer = c[i];
				} else {
					if (bestCustomer.getPurAmt() < c[i].getPurAmt())
						bestCustomer = c[i];
				}
			}
		}
		return bestCustomer;
	}

}