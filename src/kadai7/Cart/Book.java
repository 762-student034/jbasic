package kadai7.Cart;

public class Book extends Item{
	private String author;
	
	public Book() {
		super();
		author = "";
	}
	
	public Book(String name, int price, String author) {
		super(name, price);
		this.author=author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("商品名:"+getName());
		System.out.println("価格:"+getPrice()+"円");		
		System.out.println("著者: "+getAuthor());
		System.out.println("---");
	}
	
	@Override
	public String getInfo() {
		String result = getName()+"(著:"+getAuthor()+")"+"/"+getPrice()+"円";
		return result;
	}
	

}
