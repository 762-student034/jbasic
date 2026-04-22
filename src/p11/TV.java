package p11;

public class TV {
	private int ch;

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	void watch() {
		System.out.println(getCh() + "チャンネルのTVを見てるよ！");
	}

}
