package kadai;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("国語の点数を入力してください：");
		String kokugo = stringCheck(scan);
		System.out.println("数学の点数を入力してください：");
		String sugaku = stringCheck(scan);
		System.out.println("英語の点数を入力してください：");
		String eigo = stringCheck(scan);
		check(kokugo, sugaku, eigo);
		scan.close();
	}

	public static void check(String kokugo, String sugaku, String eigo) {

		String subject[] = {"国語","数学","英語"};
		int kokugoInt = Integer.parseInt(kokugo);
		int sugakuInt = Integer.parseInt(sugaku);
		int eigoInt = Integer.parseInt(eigo);
		int i = 0;
		int highScore = kokugoInt;

		if (sugakuInt > kokugoInt) {
			highScore = sugakuInt;
			i = 1;
		}
		if (eigoInt > sugakuInt) {
			highScore = eigoInt;
			i = 2;
		}
		
		System.out.println("最高点の科目は"+subject[i]+"で"+highScore);
		
		
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