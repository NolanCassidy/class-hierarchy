
public class Box implements Measurable {
	public double x = 0;
	public double y = 0;
	public double z = 0;

	public Box(double a, double b, double c) {
		x = a;
		y = b;
		z = c;
	}

	public double getArea() {
		return (2 * (x * y)) + (2 * (x * z)) + (2 * (y * z));
	}
}
