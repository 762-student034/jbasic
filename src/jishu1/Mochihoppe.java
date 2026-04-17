package jishu1;

import java.util.Scanner;

public class Mochihoppe {
	String name;
	String role;
	String character;
	String row;
	String race;
	
	public Mochihoppe(){
		this.name = "Unknown";
		this.role = "Unknown";
		this.character = "Unknown";
		this.row = "Unknown";
		this.race = "Unknown";
	}
	
	public Mochihoppe(String name, String role, String character, String row, String race) {
		this.name = name;
		this.role = role;
		this.character = character;
		this.row = row;
		this.race = race;
	}
	
	public String getName(){
		System.out.println("もちほっぺの名前を入力してください: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		return name;
	}
	
	public String getRole(){
		System.out.println("もちほっぺの役割を入力してください: ");
		Scanner scan = new Scanner(System.in);
		String role = scan.nextLine();
		return role;
	}
	
	public String getCharacter(){
		System.out.println("もちほっぺの性格を入力してください: ");
		Scanner scan = new Scanner(System.in);
		String character = scan.nextLine();
		return character;
	}
	
	public String getRow() {
		System.out.println("もちほっぺの列を入力してください: ");
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		return row;
	}
	
	public String getRace() {
		System.out.println("もちほっぺの種族を入力してください: ");
		Scanner scan = new Scanner(System.in);
		String race = scan.nextLine();
		return race;
	}
	
}
