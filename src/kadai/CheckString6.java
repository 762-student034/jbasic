package kadai;

import java.util.Scanner;

public class CheckString6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1つめの文字列を入力してください: ");
		String input1 = scan.nextLine();
		System.out.println("2つめの文字列を入力してください: ");
		String input2 = scan.nextLine();
		check(input1, input2);
		scan.close();
	}

	public static void check(String input1, String input2) {
		if (input1.length()==input2.length()) {
			System.out.println("2つの文字列は同じです。");
		} else
		System.out.println("2つの文字列は異なります。");
	}
}
