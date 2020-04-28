package week8;

public class Test {

	public static void main(String[] args) {
		Circle c1= new Circle();
//		Circle c2 = new Circle(10.0);
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println("Radius c1: "+c1.radius);
//		System.out.println("Radius c2: "+c2.radius);
//	//	System.out.println("Area of the circle is: "+c1.getArea());
//		System.out.println("Area of the circle is: "+c2.getArea());
		c1.getRadius();
		c1.setRadius(10.0);
		System.out.println(c1.getArea());
		
	}
}
