
public class Sphere implements Measurable {
	public double r = 0;

	public Sphere(double a) {
		r = a;
	}

	public double getArea() {
		return 4 * Math.PI * Math.pow(r, 2);
	}
}
