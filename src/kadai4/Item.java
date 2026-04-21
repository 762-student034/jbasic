package kadai4;

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
	public int setPrice(int price) {
		this.price = price;
		return this.price;
	}

	public String setName(String name) {
		this.name = name;
		return this.name;
	}

	//---Methods---
	// 情報出力用showInfo()メソッド
	public void showInfo() {
		String name = getName();
		int price = getPrice();
		Double priceCalc = price * 1.1;
		int priceWithTax = (int) Math.round(priceCalc);
		System.out.println("名前： " + name);
		System.out.println("価格(税抜き)： " + price + "円");
		System.out.println("価格(税込み)： " + priceWithTax + "円");
	}

}
