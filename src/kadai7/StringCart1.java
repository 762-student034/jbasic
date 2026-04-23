package kadai7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCart1 {
	public static void main(String[] args) {
		// 文字列を保持できるリストの作成
		List<Electronics> enumList = new ArrayList<>(Arrays.asList(Electronics.values()));
		
		
		// 「ロボット掃除機」の追加
		// 「ドラム式洗濯機」の追加
		// 「液晶テレビ」の追加
		
		// 拡張for文を利用して全商品を出力する
		for (Electronics list : enumList) {
			System.out.println(list);
		}
	}
}
