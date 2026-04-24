package kadai7.Step1to3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCart2 {
	public static void main(String[] args) {
		new Scanner(System.in);
		
		List<String> eList = new ArrayList<>();
		
		
		// 「ロボット掃除機」の追加
		// 「ドラム式洗濯機」の追加
		// 「液晶テレビ」の追加
			
		// 拡張for文を利用して全商品を出力する
		for (String list : eList) {
			System.out.println(list);
		}
	}
}
