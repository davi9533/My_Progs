package lab9;

public class Triangle extends Shape{
			
	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getArea() {
		return (getBase() * getHeight()) / 2;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", color=" + getColor() + "]";
	}

}
