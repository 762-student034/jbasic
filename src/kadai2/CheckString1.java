package kadai2;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("文字列を入力してください: ");
		String input = scan.next();
		check(input);
		scan.close();
	}

	public static void check(String input) {
		System.out.println("文字列の長さは"+input.length()+"です。");
	}
		


}
