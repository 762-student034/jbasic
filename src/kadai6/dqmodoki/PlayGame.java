package kadai6.dqmodoki;

import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;

		Character[] ptList = new Character[3];

		//キャラ作り
		CharacterCreation.create(ptList, scan);

		//メインループ
		while (true) {
			System.out.println("操作（1:一覧表示 2:攻撃 3:回復 9:終了）を選択してください：");

			while (true) { //終了までループ
				input = ValidateInput.getValidatedInput(scan);
				Logic.operate(ptList, input);
			}
		}

	}

}
