package kadai6;

import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {

		Character[] ptList = new Character[3];
		Scanner scan = new Scanner(System.in);

		//キャラ作り
		CharacterCreation.create(ptList);

		while (true) {
			Logic.operate(ptList);
		}

	}

}
