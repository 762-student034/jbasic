package kadai;

import java.util.Scanner;

public class CheckInteger4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("数字を入力して下さい：");
		String input = stringCheck(scan);
		judge(input);
		scan.close();
	}

	public static void judge(String input) {
		int inputInt = Integer.parseInt(input);
		String text[] = { "正の", "負の", "奇数です。", "偶数です。" };

		if (inputInt > 0 || inputInt % 2 == 1) {
			System.out.println(text[0] + text[2]);

		} 
		
		else if (inputInt > 0 || inputInt % 2 == 0) {
			System.out.println(text[0] + text[3]);
		} 
		
		else if (inputInt < 0 || inputInt % 2 == 1) {
			System.out.println(text[1] + text[2]);
		} 
		
		else if (inputInt < 0 || inputInt % 2 == 0)

		{
			System.out.println(text[1] + text[3]);
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
