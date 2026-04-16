package kadai;

import java.util.Scanner;

public class CheckInteger2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("xの値を入力してください：");
		String x = stringCheck(scan);
		System.out.println("yの値を入力してください：");
		String y = stringCheck(scan);

		judge(x, y);
		scan.close();
	}

	public static void judge(String x, String y) {

		int xInt = Integer.parseInt(x);
		int yInt = Integer.parseInt(y);
		int result = xInt - yInt;
		String header = "xはyより";
		String end[] = { "大きいです。", "小さいです。","等しいです。" };

		if (result > 0) {
			System.out.println(header + end[0]);


		} else if (result < 0) {
			System.out.println(header + end[1]);

		} else {
			System.out.println("xとyは"+ end[2]);
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
