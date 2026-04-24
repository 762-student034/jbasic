package kadai;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("パスワード：");
		String input = scan.next();
		check(input);
		scan.close();
	}

	public static void check(String input) {
		
		String text[] = { "一致", "しました。", "しませんでした。", };
		
		if(input.equals("himitu")) {
			System.out.println(text[0]+text[1]);
		}
		else {
			System.out.println(text[0]+text[2]);
		}
	}


}
