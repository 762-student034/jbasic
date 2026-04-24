package kadai7.Cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartSystem {
	// 商品情報保存リスト（フィールド）
	public static List<Item> cart = new ArrayList<Item>();

	//スキャナークラス（フィールド）
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ItemMenu.menu(cart, sc);
	}


}
