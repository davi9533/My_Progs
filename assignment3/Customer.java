package assignment3;

public class Customer {

	private String name;
	private double purAmt;
	
	
	public Customer(String name, double purAmt) {
		this.name=name;
		this.purAmt=purAmt;
	}

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}


	public double getPurAmt() {
		return purAmt;
	}
	

	public void setPurAmt(double purAmt) {
		this.purAmt = purAmt;
	}

	public String toString() {
		return "Name: "+name +" Purchase Amount: "+purAmt;
	}
	
	
	

}
