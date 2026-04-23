package kadai6;

public class Logic {

	public static void operate(Character[] ptList, int input) { //メインループのスイッチ
		switch (input) {
		case 1 -> showPTList(ptList);
		case 2 -> Attack(ptList);
		case 3 -> Heal(ptList);
		case 9 -> {
			System.out.println("終了します。");
			System.exit(0);
		}
		}
	}

	public static void showPTList(Character[] ptList) {
		for (Character c : ptList) {
			c.info(); 				//PT一覧
		}
	}

	public static void Attack(Character[] ptList) { //攻撃
		for (Character c : ptList) { 
			c.attack(); 			//攻撃できる人は攻撃
		}

	}

	public static void Heal(Character[] ptList) {
		for (Character c : ptList) {
			c.heal();				//回復できる人は回復
		}

	}
}
