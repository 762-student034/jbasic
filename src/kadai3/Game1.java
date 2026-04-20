package kadai3;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int answer = rand.nextInt(100);
		int times = 0;
		
		System.out.println("デバッグ用: " + answer);
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("数字を入力してください：");
			int input = scan.nextInt();
			if (gameLogic(answer, input) == true) {
				times++;
			} else {
				break;
			}
		}

		System.out.println(times + "回で当たりました！");
		scan.close();
	}

	public static boolean gameLogic(int answer, int input) {

		if (input > answer) {
			System.out.println("**大きいすぎです。");
			return true;
		} else if (input < answer) {
			System.out.println("**小さすぎです。");
			return true;
		}
		return false;
	}
}
