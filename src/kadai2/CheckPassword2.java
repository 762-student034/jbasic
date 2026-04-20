package kadai2;

import java.util.Scanner;

public class CheckPassword2 {

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
		System.out.println("パスワードを入力してください: ");
		input = scan.nextLine();
		while (!input.equals(password)) {
			System.out.println("再入力してください:");
			input = scan.nextLine();
		}
		System.out.println("ログインできました。");
	}
}
