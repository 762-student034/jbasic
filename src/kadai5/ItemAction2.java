package kadai5;

public class ItemAction2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Itemクラスのオブジェクトを生成し変数item1に代入する
		Item[] itemList = {
				new Item("ロボット掃除機", 50000),
				new Item("空気掃除機", 20000),
				new Item("扇風機", 4000),
		};

		for (Item list : itemList) {
			list.showInfo();
		}

	}

}