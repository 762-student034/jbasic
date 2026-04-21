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

	// ---Getters ---
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// ---Setters ---
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void introduce() {
        System.out.println("名前は" + this.name);
        System.out.println("年齢は" + this.age);
    }
	
}

