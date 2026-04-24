package kadai7.Cart;

import java.util.List;
import java.util.Scanner;

import InputVerify.ValidateInput;

public class Operations {

	public static List<Item> addItem(List<Item> list, Scanner sc) { //商品追加

		System.out.println("商品をカートに追加します");

		System.out.println("  商品名を入力してください：");
		String name = sc.nextLine();

		System.out.println("  価格を入力してください：");
		int price = ValidateInput.verifyRange(sc);

		Item i = new Item(name, price);
		list.add(i);
		showItemList(list);
		return list;
	}

	public static List<Item> addBook(List<Item> list, Scanner sc) { //書籍追加

		System.out.println("書籍をカートに追加します");

		System.out.println("  書籍名を入力してください：");
		String name = sc.nextLine();

		System.out.println("  著者を入力してください：");
		String author = sc.nextLine();

		System.out.println("  価格を入力してください：");
		int price = ValidateInput.verifyRange(sc);

		Book i = new Book(name, price, author);
		list.add(i);
		showItemList(list);
		return list;
	}

	public static void updateItem(List<Item> list, Scanner sc) { //更新
		System.out.println("情報を更新します");
		if (list.isEmpty()) {
			System.out.println("カートは空です。更新できません。");
		} else {
			try {
				System.out.println("No.を入力してください。");
				int index = ValidateInput.verifyInt(sc);
				Item i = list.get(index - 1);
				if (i instanceof Book) {
					System.out.println("  新書籍名を入力してください（現在：" + i.getName() + "): ");
					i.setName(sc.nextLine());

					System.out.println("  新著者を入力してください（現在：" + ((Book) i).getAuthor() + "): ");
					((Book) i).setAuthor(sc.nextLine());

					System.out.println("  新価格を入力してください（現在：" + i.getPrice() + "): ");
					i.setPrice(ValidateInput.verifyInt(sc));

					System.out.println("  書籍更新しました。");
					showItemList(list);
				} else {
					System.out.println("  新商品名を入力してください（現在：" + i.getName() + "): ");
					i.setName(sc.nextLine());

					System.out.println("  新価格を入力してください（現在：" + i.getPrice() + "): ");
					i.setPrice(ValidateInput.verifyInt(sc));

					System.out.println("商品更新しました。");
					showItemList(list);
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("商品は存在しません。");
			}
		}
	}

	public static void deleteItem(List<Item> list, Scanner sc) { //削除
		System.out.println("カートから削除します");
		if (list.isEmpty()) {
			System.out.println("カートは空です。削除できません。");

		} else {
			try {
				System.out.println("  No.を入力してください： ");
				int index = ValidateInput.verifyInt(sc);
				list.remove(index - 1);
				System.out.println("カートから削除しました");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("商品は存在しません。");
			}
		}

	}

	public static void search(List<Item> iList, Scanner sc) { //商品検索
		System.out.println("カートを検索します");
		System.out.println("  検索キーワードを入力してください：");
		String kw = sc.nextLine();
		int hit = 0;
		System.out.println("商品情報");
		System.out.println("-------------------------");
		for (Item i : iList) {
			if (i.getName().toLowerCase().contains(kw.toLowerCase())) { //大小文字を問わず検索できる
				System.out.println(i.getInfo());
				hit++;
			} else {
				break;
			}
		}
		System.out.println("-------------------------");
		if (hit != 0) {
			System.out.println(hit + "件の商品見つかりました。");
			System.out.println("");
		} else {
			System.out.println("商品見つかりませんでした。");
			System.out.println("");
		}
	}

	public static void buy(List<Item> iList, Scanner sc) { //商品一覧
		System.out.println("購入します。");
		int price = 0;
		if (iList.isEmpty()) {
			System.out.println("カートは空です。購入できません。");
			System.out.println("");
		} else {
			for (Item i : iList) {
				price += i.getPrice();
			}
			System.out.println("   ＊＊＊合計金額は" + price + "円です。");
			System.out.println("");

			iList.removeAll(iList);
			showItemList(iList);
		}
	}

	public static void showItemList(List<Item> iList) { //商品一覧
		System.out.println("No.    商品情報");
		System.out.println("-------------------------");
		for (int idx = 0; idx < iList.size(); idx++) {
			Item i = iList.get(idx);
			System.out.println(idx + 1 + "      " + i.getInfo());
		}
		System.out.println("-------------------------");
		System.out.println("");
	}

}
