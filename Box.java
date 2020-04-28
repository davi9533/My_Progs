/*Box that contains instance data that represents the height, width, and depth of the box. Also include a boolean variable called full as instance data that represents 
 * if the box is full or not. Define the Box constructor to accept and initialize the height, width, and depth of the box. Each newly created Box is empty (the constructor 
 * should initialize full to false). Include getter and setter methods for all instance data. Include a toString method that returns a one-line description of the box.
 * Create a driver class called BoxTest, whose main method instantiates and updates several Box objects.*/

public class Box {

	private double height, depth, width; // declaring instance variables
	private boolean full;

	// creating parameterized constructor to intialize data members.
	public Box(double depth, double width, double height) {
		this.depth = depth;
		this.width = width;
		this.height = height;

	}

	// default constructor to initialize values of boolean full data member.
	public Box() {
		full = false;
	}

	// getter & setters
	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}

	@Override

	// overriding toString method
	public String toString() {
		return "Box [height=" + height + ", depth=" + depth + ", width=" + width + ", full=" + full + "]";
	}

}
