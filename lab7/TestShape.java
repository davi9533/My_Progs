package lab9;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		
		rectangle.setLength(10);
		rectangle.setBreadth(20);
		
		triangle.setBase(10);
		triangle.setHeight(15);
		
		System.out.println("Area of rectangle is: " + rectangle.getArea() );
		System.out.println("Area of Triangle is: " + triangle.getArea());
	}

}
