package kadai7;

public class Item {
	private String name;
	private int price;
	
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
	
	public Item() {
		name = "";
		price = 0;
	}
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("商品名:"+getName());
		System.out.println("価格:"+getPrice()+"円");
		System.out.println("---");
	}
	
	public String getInfo() {
		String result = getName()+"/"+getPrice();
		return result;
	}
	

}
