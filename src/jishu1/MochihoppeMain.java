package jishu1;

public class MochihoppeMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Mochihoppe mochi = new Mochihoppe();
		String name = mochi.getName();
		String role = mochi.getRole();
		String character = mochi.getCharacter();
		String row = mochi.getRow();
		String race = mochi.getRace();
		System.out.println(name+"は"+row+"で"+character+role+"を担当している"+race+"です。");
	}
}
