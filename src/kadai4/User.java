package kadai4;

public class User {
	// フィールド（名前と年齢）
	private String name;
	private int age;

	public User() {
		name = "Unknown";
		age = 0;
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String setName(String name) {
		this.name = name;
		return this.name;
	}

	public int setAge(int age) {
		this.age = age;
		return this.age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// 情報を出力するshowInfo()メソッド
	public void showInfo() {
		String storedName = getName();
		int storedAge = getAge();
		System.out.println("名前: " + storedName + "\n年齢: " + storedAge);

	}

}
