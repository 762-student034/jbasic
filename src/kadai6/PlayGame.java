package kadai6;

import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		int input;

		Character[] ptList = new Character[3];

		//キャラ作り
		CharacterCreation.create(ptList);

		Scanner scan = new Scanner(System.in);

		while (true) {
			input = scan.nextInt();
			Logic.operate(ptList, input);
		}

	}

}
