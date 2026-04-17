package jishu1;

import java.util.Scanner;

public class Cat {
	String name;
	int age;
	String gara;

	public Cat() {
		this.name = "Unknown";
		this.age = 0;
		this.gara = "Unknown";
	}
	
	public Cat(String name, int age, String gara) {
		this.name = name;
		this.age = age;
		this.gara = gara;
	}
	
	public String getName(){
		System.out.println("猫ちゃんの名前を入力してください: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		return name;
	}
	
	public int getAge() {
		System.out.println("猫ちゃんの年齢を入力してください: ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		return age;
	}
}
