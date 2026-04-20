package p03;

public class Start {

	public static void main(String[] args) {

		Member M1 = new Member();
		Member M2 = new Member();
		Member M3 = new Member();

		M1.setMyGoal("分析を頑張る！");
		M2.setMyGoal("設計を頑張る！");
		M3.setMyGoal("実装を頑張る！");
		Member.setTeamGoal_("倍の倍のファイト！");

		M1.displayGoal();
		M2.displayGoal();
		M3.displayGoal();
	}

}
