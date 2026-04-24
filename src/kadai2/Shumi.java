package kadai2;

public class Shumi {

	private String name;
	private String[] hobbies = new String[3];

	public Shumi(String name, String hobby1, String hobby2, String hobby3) {
		this.name = name;
		this.hobbies[0] = hobby1;
		this.hobbies[1] = hobby2;
		this.hobbies[2] = hobby3;
	}

	public void introduce() {
		System.out.println("こんにちは" + name + "です。\n私の趣味は、");
		for (String element : hobbies) {
			System.out.println("・"+element);
		}
		System.out.println("です。");
	}
}