package p14;

public class Mobile extends TV {
	private String telNo;

	public Mobile() {
		telNo = "";
	}

	public Mobile(String telNo) {
		this.telNo = telNo;
	}

	public Mobile(String telNo, int ch) {
		//		setCh(ch);
		//		super.setCh(ch);
		super(ch);
		this.telNo = telNo;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	void talk() {
		System.out.println("電話番号: " + getTelNo());
		System.out.println("会話中だよ!");
	}

}
