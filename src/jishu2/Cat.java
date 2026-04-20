package jishu2;

public class Cat {
	//--------------Param-----------------
	private String name;
	private String breed;
	private int age;
	private String favFood;

	
	//--------------Constructor-----------------
	public Cat() {
		name = "Unknown";
		breed = "Unknown";
		age = 0;
		favFood = "Unknown";
	}

	public Cat(String name, String breed, int age, String favFood) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.favFood = favFood;
	}

	//--------------Setter-----------------
	public String setName(String name) {
		this.name = name;
		return this.name;
	}

	public String setBreed(String breed) {
		this.breed = breed;
		return this.breed;
	}

	public int setAge(int age) {
		this.age = age;
		return this.age;
	}
	
	public String setFavFood(String favFood) {
		this.favFood = favFood;
		return this.favFood;
	}

	
	//--------------Getter-----------------
	public String getBreed() {
		return breed;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getFavFood() {
		return favFood;
	}


}
