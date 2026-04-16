package kadai;

import java.util.Scanner;

public class CheckInteger3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("年齢を入力して下さい：");
		String input = stringCheck(scan);
		judge(input);
		scan.close();
	}

	public static void judge(String input) {
		int inputInt = Integer.parseInt(input);
		String text[] = {"0~130で入力してください。","正しい年齢です。"};


		if (inputInt < 0 || inputInt > 130) {
			System.out.println(text[0]);

		} else if (inputInt >= 0 || inputInt<=130) {
			System.out.println(text[1]);
		}
	}

	public static String stringCheck(Scanner scan) {
		String selection;

		while (true) {
			selection = scan.nextLine();

			try {
				Integer.parseInt(selection);
				return selection;
			} catch (NumberFormatException e) {
				System.out.println("数字を入力してください。");
			}
		}
	}

}
