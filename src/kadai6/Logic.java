package kadai6;

import java.util.Scanner;

public class Logic {

	public static int getValidatedInput(Scanner scan) {
		while (true) {

			if (scan.hasNextInt()) {
				int input = scan.nextInt();

				if (input == 1 || input == 2 || input == 3 || input == 9) {
					return input;
				}

				System.out.println("無効な入力です。1, 2, 3, 9 のいずれかを入力してください。");

			} else {
				System.out.println("数字を入力してください。");
				scan.next();
			}
		}
	}

	public static void operate(Character[] ptList, int input) {
		switch (input) {
		case 1 -> showPTList(ptList);
		case 2 -> Attack(ptList);
		case 3 -> Heal(ptList);
		case 9 -> {
			System.out.println("終了します。");
			System.exit(0);
		}
		}
	}

	public static void showPTList(Character[] ptList) {
		for (Character c : ptList) {
			c.info();
		}

	}

	public static void Attack(Character[] ptList) {

		for (Character c : ptList) {
			c.attack();
		}

	}

	public static void Heal(Character[] ptList) {
		for (Character c : ptList) {
			c.heal();
		}

	}
}
