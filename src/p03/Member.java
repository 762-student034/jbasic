package p03;

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

	public static String setTeamGoal_(String teamGoal_) {
		Member.teamGoal_ = teamGoal_;
		return Member.teamGoal_;
	}

	public String getMyGoal() {
		return myGoal;
	}

	public String getTeamGoal() {
		return teamGoal_;
	}

	void displayGoal() {
		System.out.println("個人の目標: " + getMyGoal());
		System.out.println("チームの目標: " + getTeamGoal() + "\n------------------");
	}
}
