package lab9;

public class Shape {
			
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return 0;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
}
