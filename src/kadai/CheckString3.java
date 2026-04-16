package kadai;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("名前： ");
		String input = scan.nextLine();
		check(input);
		scan.close();
	}

	public static void check(String input) {

		String text[] = { "ようこそ", "エラー：20文字以内で入力してください。","さん。"};
		
		if(input.length()>20) {
			System.out.println(text[1]);
		} else {
			System.out.println(text[0]+input+text[2]);
		}
	}
}