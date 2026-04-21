package jishu2;

interface cat {
	public void sleep();

	public void makeSound();
}

class coffeeCat implements cat {
	@Override
	public void sleep() {
		System.out.println("Zzz... にゃ...");
	}

	@Override
	public void makeSound() {
		System.out.println("シャーーーーー");
	}
}

public class CatInterface {
	public static void main(String[] args) {
		coffeeCat coffee = new coffeeCat();
		coffee.makeSound();
		coffee.sleep();

	}
}
