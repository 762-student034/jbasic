package test034;

public class Employee {
	//フィールド
	private String name;
	private int age;

	//コンストラクタ
	public Employee() {
		name = "Unknown";
		age = 0;
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//ゲッターセッター
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void introduce() {
		System.out.println(getName() + "さんは" + getAge() + "歳です。");
	}

}