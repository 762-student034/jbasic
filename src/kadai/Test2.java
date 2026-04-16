package kadai;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("国語の点数を入力してください：");
		String kokugo = stringCheck(scan);
		System.out.println("数学の点数を入力してください：");
		String sugaku = stringCheck(scan);
		System.out.println("英語の点数を入力してください：");
		String eigo = stringCheck(scan);
		check(kokugo,sugaku,eigo);
		scan.close();
	}

	public static void check(String kokugo, String sugaku, String eigo) {

		int kokugoInt = Integer.parseInt(kokugo) ;
		int sugakuInt = Integer.parseInt(sugaku) ;
		int eigoInt = Integer.parseInt(eigo) ;

		if (kokugoInt >=80 && sugakuInt >= 75 && eigoInt >= 70) {
			System.out.println("合格です。");
		}
		else {
			System.out.println("不合格です。");
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