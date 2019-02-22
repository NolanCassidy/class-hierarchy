
public class Rectangle implements Measurable {
	public double x = 0;
	public double y = 0;

	public Rectangle(double a, double b) {
		x = a;
		y = b;
	}

	public double getArea() {
		return x * y;
	}
}
