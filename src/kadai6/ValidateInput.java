package kadai6;

import java.util.Scanner;

public class ValidateInput {
	public static int getValidatedInput(Scanner scan) { //入力確認
		while (true) {
			if (scan.hasNextInt()) {
				int input = scan.nextInt();

				if (input == 1 || input == 2 || input == 3 || input == 9) {
					return input;
				}
				System.out.println("無効な入力です。");
				System.out.println("操作（1:一覧表示 2:攻撃 3:回復 9:終了）を選択してください：");
			} else {
				System.out.println("数字を入力してください。");
				System.out.println("操作（1:一覧表示 2:攻撃 3:回復 9:終了）を選択してください：");
				scan.next();
			}
		}
	}
}
