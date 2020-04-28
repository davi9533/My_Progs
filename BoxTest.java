
public class BoxTest {

	public static void main(String[] args) {

		Box b1 = new Box(4.5, 5.6, 7.2); // creating object of Box class and passing values in the constructor.
		System.out.println(b1); // displaying the values of instance variables.
		Box b2 = new Box(); // creating second object of Box class.
		b2.setDepth(9.2); // updating value of depth.
		b2.setFull(true); // updating value of full.
		b2.setHeight(6.2); // updating value of height.
		b2.setWidth(5.5); // updating value of width.
		System.out.println(b2); // displaying all the updated values.

	}

}
