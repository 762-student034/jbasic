package test034;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("年齢を入力してください。");
		int input = verifyRange(sc);
		System.out.println(input+"歳で登録しました");
	}
	

	
	public static int verifyRange(Scanner scan) {
		while (true) {
			String input = scan.nextLine();

			try {
				int value = Integer.parseInt(input);

				if (value < 0 || value > 130) {
					System.out.println("0以上130以下入力してください: ");
				} else {
					return value;
				}

			} catch (NumberFormatException e) {
				System.out.println("整数で入力してください: ");
			}
		}
	}

}
