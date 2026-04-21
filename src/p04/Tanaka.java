package p04;

public class Tanaka extends Human {
	private String bucho;
	private String company;

	public Tanaka() {
		super();
		bucho = "";
		company = "";
	}

	public Tanaka(String name, int age, String bucho, String company) {
		super(name, age); //Humanクラスを継承した引数
		this.bucho = bucho;
		this.company = company;
	}

	public String setBucho(String bucho) {
		this.bucho = bucho;
		return this.bucho;
	}

	public String setCompany(String company) {
		this.company = company;
		return this.company;
	}

	public String getBucho() {
		return bucho;
	}

	public String getCompany() {
		return company;
	}

	public void introduce() {
		System.out.println("名前は" + getName());
		System.out.println("年齢は" + getAge());
		System.out.println("上司は" + getBucho());
		System.out.println("配属は" + getCompany());
	}
}
