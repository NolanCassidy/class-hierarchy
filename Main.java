import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		Random random = new Random();
		Measurable M;
		int rc = 0;
		int bc = 0;
		int cc = 0;
		int sc = 0;
		ArrayList<Measurable> list = new ArrayList<Measurable>();
		for (int i = 0; i < 1000; i++) {
			double x = nextDouble();
			double y = nextDouble();
			double z = nextDouble();
			int value = random.nextInt(4);
			if (value == 0) {
				rc += 1;
				M = new Rectangle(x, y);
			} else if (value == 1) {
				bc += 1;
				M = new Box(x, y, z);
			} else if (value == 2) {
				cc += 1;
				M = new Circle(x);
			} else {
				sc += 1;
				M = new Sphere(x);
			}
			list.add(M);
		}
		System.out.println("Rectangles: " + rc + " Boxes: " + bc + " Circles: " + cc + " Spheres: " + sc);
		System.out.println("Sum: " + calculateSum(list));
	}

	private static double nextDouble() {
		Random random = new Random();
		double value = Double.MIN_VALUE + random.nextDouble();
		return value;
	}

	private static double calculateSum(ArrayList<Measurable> list) {
		double sum = 0;
		for (Measurable obj : list) {
			sum = sum + obj.getArea();
		}
		return sum;
	}

}
