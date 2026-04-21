package gomi;

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

class sugarCat implements cat{
	@Override
	public void sleep() {
		System.out.println("にゃーーー");
	}
	
	public void makeSound() {
		System.out.println("ウロロロ");
	}
	
}

public class CatInterface {
	public static void main(String[] args) {
		coffeeCat coffee = new coffeeCat();
		coffee.makeSound();
		coffee.sleep();
		
		coffee = null;
		
		sugarCat sugar = new sugarCat();
		sugar.makeSound();
		sugar.sleep();
		
		sugar = null;
	}
}
