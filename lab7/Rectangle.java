package lab9;

public class Rectangle extends Shape{
			
	private int length;
	private int breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public double getArea() {
		return getLength() * getBreadth();
	}
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", color=" + getColor() + "]";
	}
}
