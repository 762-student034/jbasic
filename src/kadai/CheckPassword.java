package kadai;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		loop(setPassword());
	}

	public static String setPassword() {
		String password = "himitu";
		return password;
	}

	public static void loop(String password) {
		Scanner scan = new Scanner(System.in);
		String input;
		for (int i = 0; i < 3; i++) {
			System.out.println("パスワードを入力してください: ");
			input = scan.nextLine();
			if (!input.equals(password)) {
				System.out.println("不正解です。");
			} else{
				System.out.println("ログインできました。");
				break;
			}
		}
	}
}
