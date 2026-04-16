package kadai;

import java.util.Random;
import java.util.Scanner;

public class CheckRandom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("じゃんけんゲーム");

			String selection = stringCheck(scan, 1);
			judge(selection);

			System.out.println("もう一度やりますか？");
			String again = stringCheck(scan, 2);

			if (again.equals("2")) {
				System.out.println("終了します。");
				break;
			}
		}

		scan.close();
	}

	public static void judge(String a) {

		Random rand = new Random();
		int cpuSelection = rand.nextInt(3) + 1;
		int selection = Integer.parseInt(a);

		String[] statusString = { "君の負けです。", "君の勝ちです。", "引き分けです。" };
		String[] hands = { "", "グー", "パー", "チョキ" };

		System.out.println("あなたの手: " + hands[selection]);
		System.out.println(ascii[selection]);
		System.out.println("CPUの手: " + hands[cpuSelection]);
		System.out.println(ascii[cpuSelection]);

		switch (selection - cpuSelection) {
		case -1:
		case 2:
			System.out.println(statusString[0]);
			break;
			
		case -2:
		case 1:
			System.out.println(statusString[1]);
			break;
			
		case 0:
			System.out.println(statusString[2]);
			break;
		}
	}

	public static String stringCheck(Scanner scan, int mode) {
		String selection;

		while (true) {
			if (mode == 1) {
				System.out.println("選択してください。1: グー、2: パー、 3: チョキ");
			} else {
				System.out.println("選択してください。1: はい、 2: いいえ");
			}

			selection = scan.nextLine();

			try {
				int num = Integer.parseInt(selection);

				if (mode == 1 && (num < 1 || num > 3)) {
					System.out.println("1〜3の範囲で入力してください。");
					continue;
				}

				if (mode == 2 && (num < 1 || num > 2)) {
					System.out.println("1〜2の範囲で入力してください。");
					continue;
				}

				return selection;

			} catch (NumberFormatException e) {
				System.out.println("数字を入力してください。");
			}
		}
	}

	static String[] ascii = {
			"",

			// 1: グー
			"    _______\n" +
					"---'   ____) \n" +
					"      (_____) \n" +
					"      (_____) \n" +
					"      (____) \n" +
					"---.__(___)",

			// 2: パー
			"     _______\n" +
					"---'    ____)____ \n" +
					"           ______) \n" +
					"          _______) \n" +
					"         _______) \n" +
					"---.__________)",

			// 3: チョキ
			"    _______\n" +
					"---'   ____)____ \n" +
					"          ______) \n" +
					"       __________) \n" +
					"      (____) \n" +
					"---.__(___)"
	};
}
