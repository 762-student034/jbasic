package jishu2;

public class Dog {
	String name;
	String color;

	public Dog() {
		this.name = "Unknown";
		this.color = "Unknown";
	}
	
	public Dog(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog("Butter","Cream");
	System.out.println(dog.name+" "+dog.color);
	}
}
