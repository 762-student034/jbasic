package p13;

public class TV {
	private int ch;

	public TV() {
		this.ch = 0;
	}

	public TV(int ch) {
		this.ch = ch;
	}

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
