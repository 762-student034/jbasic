package p04;

public class Human {
	private String name;
	private int age;

	// ---Constructor---

	public Human() {
		this.name = "Unknown";
		this.age = 0;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// --- Proper Getters ---
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// --- Proper Setters ---
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("何もくれなかったよ！\n自腹で食べるよ！\n");
	}

	public void eat(String bento) {
		System.out.println(bento + "をもらったよ。\nそれを食べるよ！\n");
	}

	public void eat(int money) {
		System.out.println(money + "円もらったよ。\n寿司屋に行くよ！\n");
	}

}
