package kadai3;

public class Member {
	boolean isPremium;
	int point;

	public Member() {
		this.point = 0;
		this.isPremium = false;
	}

	public static int getPoints(int price, boolean isPrem) {
		double ptDbl = 0;
		int pt = 0;
		if (isPrem) {
			ptDbl = price * 0.2;
			pt = (int) ptDbl;
		} else if (!isPrem) {
			ptDbl = price * 0.1;
			pt = (int) ptDbl;
		}
		return pt;
	}

	public static int getPoints(int price, int isPrem) {
		double ptDbl = 0;
		int pt = 0;
		if (isPrem - 1 == 0) {
			ptDbl = price * 0.1;
			pt = (int) ptDbl;
		} else if (isPrem - 1 == 1) {
			ptDbl = price * 0.2;
			pt = (int) ptDbl;
		}
		return pt;
	}
}
