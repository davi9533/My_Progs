package week9;

public class Class1 {

	private double radius=1;
	private static int numberofObjects=0;
	
	//First Constructor
	public Class1() {
		numberofObjects++;
	}
	
	//Second Constructor
	public Class1(double newRadius) {
		radius=newRadius;
		numberofObjects++;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		this.radius = (newRadius>=0 ? newRadius : 0);
	}

	public static int getNumberofObjects() {
		return numberofObjects;
	}

	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	
}
