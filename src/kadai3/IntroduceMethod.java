package kadai3;

public class IntroduceMethod {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person tanaka = new Person("田中太郎", 25);
		Person suzuki = new Person("鈴木一郎", 30);

		tanaka.introduce();
		System.out.println("---");
		suzuki.introduce();
	}
}
