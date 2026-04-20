package kadai3;

import java.util.Scanner;

public class UserRegistration1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Person person = new Person();
		String name;
		int age;

		// 名前入力
		while (true) {
			System.out.print("名前を入力してください：");
			name = scan.nextLine(); // assign to existing variable
			if (!Person.hasNameError(name)) {
				person.setName(name);
				break;
			}
		}

		// 年齢入力
		while (true) {
			System.out.print("年齢を入力してください：");
			age = scan.nextInt();
			try {
				if (!Person.hasAgeError(age)) {
					person.setAge(age);
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("整数を入力してください。");
			}
		}

		System.out.println("名前：" + person.getName() + "、年齢： " + person.getAge() + "で登録しました。");
		scan.close();
	}
}
