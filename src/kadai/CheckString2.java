package kadai;

import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("色を入力してください。");
		String input = scan.next();
		input = input.toLowerCase();
		check(input);
		scan.close();
	}

	public static void check(String input) {

		String text[] = { "赤です。", "緑です", "青です。", "他の色を入力してください。" };

		switch (input) {

		case "red":
			System.out.println(text[0]);
			break;
		case "green":
			System.out.println(text[1]);
			break;
		case "blue":
			System.out.println(text[2]);
			break;
		default:
			System.out.println(text[3]);
			break;
		}

	}
}