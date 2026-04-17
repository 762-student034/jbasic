package kadai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckString5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("繰り返す回数を入力してください: ");
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
		String result = "";
		String input = "";
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < times; i++) {
			System.out.println((i + 1) + "つめの文字列を入力してください: ");
			input = scan.nextLine();
			result += input;
		}
		System.out.println(result);
	}
}
