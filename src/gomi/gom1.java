package gomi;

public class gom1 {

	public static void main(String[] args) {
		calc(-10, 20);
	}

	static void calc(int x, int y) {
		if (x < 0) {
			return;
		}

		System.out.println(x + y);
	}
}
