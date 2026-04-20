package kadai3;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		Random rand = new Random();

		int answer = rand.nextInt(100);

//		System.out.println("デバッグ用: " + answer);
		Scanner scan = new Scanner(System.in);
		int times = gameLogic(answer, scan, 0); 

		System.out.println(times + "回で当たりました！");
		scan.close();
	}

	public static int gameLogic(int answer, Scanner scan, int times) {
		System.out.println("**数字を入力してください: ");
        int input = scan.nextInt();
        times++;
		if (input > answer) {
			System.out.println("**大きいすぎです。");
			return gameLogic(answer, scan, times);
		} else if (input < answer) {
			System.out.println("**小さすぎです。");
			return gameLogic(answer, scan, times);
		}
		System.out.println("正解です！");
		return times;
	}
}
