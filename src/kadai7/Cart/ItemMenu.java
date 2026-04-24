package kadai7.Cart;

import java.util.List;
import java.util.Scanner;

import InputVerify.ValidateInput;

public class ItemMenu {
	public static void menu(List<Item> list, Scanner sc) {
		int s;
		while (true) {
			System.out.println("1: 商品追加");
			System.out.println("2: 書籍追加");
			System.out.println("3: 情報更新");
			System.out.println("4: カートから削除");
			System.out.println("5: カートを検索");
			System.out.println("6: 購入");
			System.out.println("9: 終了");
			System.out.println("メニューを選択してください：");
			s = ValidateInput.verifyInt(sc);

			switch (s) {
			case 1 -> Operations.addItem(list, sc);
			case 2 -> Operations.addBook(list, sc);
			case 3 -> Operations.updateItem(list, sc);
			case 4 -> Operations.deleteItem(list, sc);
			case 5 -> Operations.search(list, sc);
			case 6 -> Operations.buy(list, sc);
			case 9 -> {
				System.out.println("またご来店ください");
				System.exit(0);
			}
			default -> System.out.println("1, 2, 3, 4, 5, 6, 9を入力してください。");

			}
		}
	}
}
