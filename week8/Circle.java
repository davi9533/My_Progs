package week8;

public class Circle {

	double radius = 3.0;

	Circle() {

	}

	Circle(double newRadius) {
		this.radius = newRadius;
	}

	public double getRadius() {
		return radius;

	}

	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

}
