package InputVerify;

import java.util.Scanner;

public class ValidateInput {

    // 文字数チェック
    public static String verifyLength(Scanner scan, int maxLength) {
        while (true) {
            String input = scan.nextLine();

            if (input.length() <= maxLength) {
                return input;
            }
            System.out.println(maxLength + "文字以内で入力してください。");
			scan.next();
        }
    }

    // 整数チェック
	public static int verifyRange(Scanner scan) {
		while (true) {
			String input = scan.nextLine();

			try {
				int value = Integer.parseInt(input);

				if (value < 0) {
					System.out.println("マイナスの値です。");
				} else {
					return value;
				}

			} catch (NumberFormatException e) {
				System.out.println("整数の数字を入力してください。");
			}
		}
	}

	public static int verifyInt(Scanner scan) {
		while (true) {
			String input = scan.nextLine();
			try {
				return Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("整数の数字を入力してください。");
			}
		}
	}
}
