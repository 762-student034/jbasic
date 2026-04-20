package kadai3;

public class Member {
	boolean isPremium;
	int point;

	public Member() {
		this.point = 0;
		this.isPremium = false;
	}

	public static double getPoints(int price, boolean isPrem) {
		double rate = isPrem ? 0.2 : 0.1;
		return price * rate;
	}

	public static int getPoints(int price, int isPrem) {
		if (isPrem == 0) {
			return (int) (price * 0.2);
		} else if (isPrem == 1) {
			return (int) (price * 0.1);
		}
		return 0;
	}
}
