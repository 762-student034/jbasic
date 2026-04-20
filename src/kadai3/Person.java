package kadai3;

public class Person {
	String name;
	int age;

	public Person() {
		this.name = "Unknown";
		this.age = 0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void introduce(String name, int age) {
		System.out.println(name + "は" + age + "歳です。");
		System.out.println("10年後は" + (age + 10) + "歳です。");
	}

	public static boolean hasNameError(String name) {
		if (name.length() > 20) {
			System.out.println("名前は20文字いないで入力してください。");
			return false;
		} else if (name.equals("admin")) {
			System.out.println("利用できない名前です。");
			return false;
		} else if (name.contains("㌔")) {
			System.out.println("名前に禁止文字が含まれています。");
			return false;
		}
		return true;
	}

	public static boolean hasAgeError(int age) {
		if (age < 0 || age > 130) {
			System.out.println("年齢は0以上130以下で入力してください。");
			return false;
		}
		return true;
	}

}
