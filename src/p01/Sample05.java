package p01;

import java.util.Random;

public class Sample05 {

	public static void main(String[] args) {
		int x = 10;
		double a = x;

		double b = 3.14;
		float y = (float) b;

		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		System.out.println(coinToss());

	}

	public static boolean coinToss() {
		boolean bool = true;
		Random rand = new Random();
		int x = rand.nextInt(100);
		if (x % 2 == 0) {
			bool = true;
		} else {
			bool = false;
		}

		return bool;
	}

}
