package kadai6;

public class Item {
	private String name; //商品名
	private int price; //価格
	
	//---ゲッター、セッター---
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Item(){
		name = "Unknown";
		price = 0;
	}
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//情報を表示
	public void showInfo() {
		System.out.println("商品名: "+getName());
		System.out.println("価格: "+getPrice()+"円");

	}

}
