package p23;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k;

		while (true) {
			try {
				System.out.println("iの数字を入力してください。 9で終了させる。");
				i = sc.nextInt();
				if (i == 9) {
					System.out.println("終了します。");
					System.exit(0);
				}
				
//				if ((i + "").equals("")) {
//					System.out.println("空白はできません。");
//					continue;
//				}
				
//				if ((i+"").trim().isEmpty()) {
//					System.out.println("空白不可です。文字を入力してください。");
//				} else {
//					break;
//				}
				
				sc.nextLine();
				System.out.println("jの数字を入力してください。");
				j = sc.nextInt();
				sc.nextLine();

				k = i / j;
				System.out.println("i/j=" + k);
			}catch (NullPointerException e) {
				System.out.println("ぬるぽ　ｶﾞｯ");
			}
			catch (Exception e) {
				System.out.println(e.toString());
				System.out.println("^ 上記はエラーの詳細");
			} finally {
				System.out.println("任意の入力で最初に戻ります。");
				sc.nextLine();
			}
		}
	}

}
