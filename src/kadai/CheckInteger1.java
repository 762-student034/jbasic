package kadai;

import java.util.Scanner;

public class CheckInteger1{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("数字を入力して下さい：");
		String selection = stringCheck(scan);
		judge(selection);
		scan.close();
	}

	public static void judge(String a) {

		int selection = Integer.parseInt(a);

		if (selection == 7) {
			System.out.println("大当たり！");
		} else {
			System.out.println("ハズレ");
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
