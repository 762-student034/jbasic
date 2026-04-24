package test034;

public class Exam3 {

	public static void main(String[] args) {

		System.out.println(rectangle(3, 3));
		System.out.println(triangle(3, 3));
	}

	public static int rectangle(int l, int w) {
		int a = l * w;
		return a;
	}

	public static double triangle(int w, int h) {
		double a = (double) w * h / 2;
		return a;
	}
}
