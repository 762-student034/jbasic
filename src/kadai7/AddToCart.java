package kadai7;

import java.util.List;
import java.util.Scanner;

public class AddToCart {
	
	public static List<String> addItem(List<String> eList, Scanner sc, int times) {
		String item;
		for (int i = 0; i < times; i++) {
			System.out.println("商品を追加してください：");
			item = sc.nextLine();
			eList.add(item);
		}
		return eList;
	}
}
