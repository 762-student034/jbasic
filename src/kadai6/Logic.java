package kadai6;

import java.util.Scanner;

public class Logic {

	public static void operate(Character[] ptList) {
		Scanner scan = new Scanner(System.in);

		System.out.println("操作（1:一覧表示 2:攻撃 3:回復 9:終了）を選択してください：");
		int input = scan.nextInt();

		switch (input) {
		case 1:
			showPTList(ptList);
			break;
		case 2:
			Attack(ptList);
			break;

		case 3:
			Heal(ptList);
			break;

		case 9:
			System.out.println("終了します。");
			System.exit(0);
		}
	}

	public static void showPTList(Character[] ptList) {

		for (Character i : ptList) {
			if (i instanceof Warrior w) {
				w.info();
			} else if (i instanceof Healer h) {
				h.info();
			} else if (i instanceof Monk m) {
				m.info();
			}
		}

	}

	public static void Attack(Character[] ptList) {

		for (Character i : ptList) {
			if (i instanceof Warrior w) {
				w.attack();
			} else if (i instanceof Healer) {
				continue;
			} else if (i instanceof Monk m) {
				m.attack();
			}
		}

	}

	public static void Heal(Character[] ptList) {
		for (Character i : ptList) {
			if (i instanceof Warrior) {
				continue;
			} else if (i instanceof Healer h) {
				h.heal();
			} else if (i instanceof Monk m) {
				m.heal();
			}
		}

	}
}
