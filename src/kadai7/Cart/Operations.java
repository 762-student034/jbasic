package kadai7.Cart;

import java.util.List;
import java.util.Scanner;

import InputVerify.ValidateInput;

public class Operations {

    // 商品追加
    public static List<Item> addItem(List<Item> list, Scanner sc) {
        System.out.println("商品をカートに追加します");

        System.out.print("  商品名を入力してください：");
        String name = sc.nextLine();

        System.out.print("  価格を入力してください：");
        int price = ValidateInput.verifyRange(sc);

        list.add(new Item(name, price));
        showItemList(list);
        return list;
    }

    // 書籍追加
    public static List<Item> addBook(List<Item> list, Scanner sc) {
        System.out.println("書籍をカートに追加します");

        System.out.print("  書籍名を入力してください：");
        String name = sc.nextLine();

        System.out.print("  著者を入力してください：");
        String author = sc.nextLine();

        System.out.print("  価格を入力してください：");
        int price = ValidateInput.verifyRange(sc);

        list.add(new Book(name, price, author));
        showItemList(list);
        return list;
    }

    // 商品更新
    public static void updateItem(List<Item> list, Scanner sc) {
        System.out.println("情報を更新します");

        if (list.isEmpty()) {
            System.out.println("カートは空です。更新できません。\n");
            return;
        }

        System.out.print("No.を入力してください：");
        int index = ValidateInput.verifyInt(sc) - 1;

        if (index < 0 || index >= list.size()) {
            System.out.println("商品は存在しません。\n");
            return;
        }

        Item item = list.get(index);

        System.out.print("  新商品名を入力してください（現在：" + item.getName() + "）：");
        item.setName(sc.nextLine());

        if (item instanceof Book book) {
            System.out.print("  新著者を入力してください（現在：" + book.getAuthor() + "）：");
            book.setAuthor(sc.nextLine());
        }

        System.out.print("  新価格を入力してください（現在：" + item.getPrice() + "）：");
        item.setPrice(ValidateInput.verifyInt(sc));

        System.out.println("商品を更新しました。\n");
        showItemList(list);
    }

    // 商品削除
    public static void deleteItem(List<Item> list, Scanner sc) {
        System.out.println("カートから削除します");

        if (list.isEmpty()) {
            System.out.println("カートは空です。削除できません。\n");
            return;
        }

        System.out.print("No.を入力してください：");
        int index = ValidateInput.verifyInt(sc) - 1;

        if (index < 0 || index >= list.size()) {
            System.out.println("商品は存在しません。\n");
            return;
        }

        list.remove(index);
        System.out.println("カートから削除しました。\n");
        showItemList(list);
    }

    // 商品検索
    public static void search(List<Item> list, Scanner sc) {
        System.out.println("カートを検索します");
        System.out.print("  検索キーワードを入力してください：");
        String kw = sc.nextLine().toLowerCase();

        int hit = 0;

        System.out.println("商品情報");
        System.out.println("-------------------------");

        for (Item i : list) {
            if (i.getName().toLowerCase().contains(kw)) {
                System.out.println(i.getInfo());
                hit++;
            }
        }

        System.out.println("-------------------------");

        if (hit > 0) {
            System.out.println(hit + "件の商品が見つかりました。\n");
        } else {
            System.out.println("商品が見つかりませんでした。\n");
        }
    }

    // 購入処理
    public static void buy(List<Item> list, Scanner sc) {
        System.out.println("購入します。");

        if (list.isEmpty()) {
            System.out.println("カートは空です。購入できません。\n");
            return;
        }

        int total = list.stream().mapToInt(Item::getPrice).sum();

        System.out.println("＊＊＊合計金額は " + total + " 円です。\n");

        list.clear();
        showItemList(list);
    }

    // 商品一覧表示
    public static void showItemList(List<Item> list) {
        System.out.println("No.    商品情報");
        System.out.println("-------------------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "      " + list.get(i).getInfo());
        }

        System.out.println("-------------------------\n");
    }
}
