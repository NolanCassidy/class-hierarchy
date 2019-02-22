
public class Circle implements Measurable {
	public double r = 0;

	public Circle(double a) {
		r = a;
	}

	public double getArea() {
		return Math.PI * Math.pow(r, 2);
	}
}
