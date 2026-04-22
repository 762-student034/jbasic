package kadai6;

import java.util.Scanner;

public class CharacterCreation {
	
	public static Character[] create(Character[] ptList) {
		Scanner scan = new Scanner(System.in);
		System.out.println("===パーティーを作成します===");
		
		for (int i = 0; i<ptList.length; i++) {
			System.out.println("どちら(1:戦士 2:ヒーラー 3:僧侶)を作成しますか: ");
			int selection = scan.nextInt();
			scan.nextLine();
			System.out.println("名前: ");
			String name = scan.nextLine();
			
			switch(selection) {
			case 1: ptList[i] = new Warrior(name);
			case 2: ptList[i] = new Healer(name);
			case 3: ptList[i] = new Monk(name);
			}
		}
		System.out.println("===パーティーを作成しました===");
		return ptList;
	}

}
