package kadai2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckString4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("文字列の個数を入力してください:  ");
			int noOfTimes = 0;

			try {
				noOfTimes = scan.nextInt();
				scan.nextLine();
				loop(noOfTimes);
				break;
			} catch (InputMismatchException e) {
				System.out.println("整数を入力してください。");
				scan.nextLine();
			}
		}

		scan.close();
	}

	public static void loop(int times) {
		String[] result = new String[times];
		int longest = 0;
		String longestStr = "";
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < times; i++) {
			System.out.println((i + 1) + "つめの文字列を入力してください: ");
			result[i] = scan.nextLine();
			if (longest < result[i].length()) {
				longest = result[i].length();
				longestStr = result[i];
			}
		}
		System.out.println("最も長い文字列は「"+longestStr+"」です。");
	}
}