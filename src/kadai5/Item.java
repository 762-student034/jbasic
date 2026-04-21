package kadai5;

public class Item {
	// フィールド（名前と価格を定義する）
	private String name;
	private int price;

	public Item() {
		name = "";
		price = 0;
	}

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	//---Getter---
	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	//---Setter---
	public void setPrice(int price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	//---Methods---
	// 情報出力用showInfo()メソッド
	public void showInfo() {
		String name = getName();
		int price = getPrice();
		System.out.println("名前： " + name);
		System.out.println("価格:  " + price + "円");
		System.out.println("---");
}

}
