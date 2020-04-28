package lab8;

public class Test {

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		System.out.println("Radius is " + c1.getRadius() + ", Height is " + c1.getHeight() + ", Color is "
				+ c1.getColor() + ", Base area is " + c1.getArea() + ", Volume is " + c1.getVolume());

		Cylinder c2 = new Cylinder(7.0, 4.0);
		System.out.println("Radius is " + c2.getRadius() + ", Height is " + c2.getHeight() + ", Color is "
				+ c2.getColor() + ", Base area is " + c2.getArea() + ", Volume is " + c2.getVolume());

	}
}
