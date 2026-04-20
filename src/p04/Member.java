package p04;

public class Member {

	private String myGoal;
	static String teamGoal_;
	
	public Member() {
		myGoal = "";
		teamGoal_ = "";
	}
	
	public Member(String input1, String input2) {
		myGoal = input1;
		teamGoal_ = input2;
	}
	
	public String setMyGoal(String myGoal) {
		this.myGoal = myGoal;
		return this.myGoal;
	}
	
	public String setteamGoal_(String teamGoal_) {
		Member.teamGoal_ = teamGoal_;
		return Member.teamGoal_;
	}
	
	public String getMyGoal() {
		return myGoal;
	}

	void displayGoal() {
		System.out.println("個人の目標: " + myGoal);
		test();
		System.out.println("チームの目標: " + teamGoal_+"\n------------------");
	}
	
	static void test() {
		System.out.println("テスト"+teamGoal_);
	}
}
