package p01;

import java.util.Scanner;

public class Sample10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("名前を入力してください: ");
		String name = scan.nextLine();
		System.out.println("年齢を入力してください: ");
		String age = scan.next();
		System.out.println(age+"歳の"+name+"ですね。");
		scan.close();
	}
}
