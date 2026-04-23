package kadai7;

import java.util.ArrayList;
import java.util.List;

public class ItemAction1 {

	public static void main(String[] args) {
		// Itemクラスのリストを作成
		List<Item> iList = new ArrayList<>();

		// 商品をリストに追加（３つ）
		iList.add(new Item("ロボット掃除機", 50000));
		iList.add(new Item("ドラム式洗濯機", 200000));
		iList.add(new Item("液晶テレビ", 100000));

		//拡張for文を利用して1件ずつ商品情報を出力する
		for (Item list : iList) {
			list.showInfo();
		}
	}

}
