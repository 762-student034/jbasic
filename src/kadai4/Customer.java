package kadai4;

public class Customer {

	private int id;
	private String name;

	//---コンストラクタ---
	public Customer() {
		id = -1;
		name = "Unknown";
	}

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Customer(String name) {
		id = -1;
		this.name = name;
	}

	//---セッター---

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	//---ゲッター---

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	//---課題に求められたメソッド

	public void setData(String name) {
		this.id = 0;
		this.name = name;
	}

	public void setData(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void showData() {
		System.out.println(id + " : " + name);
	}

}
