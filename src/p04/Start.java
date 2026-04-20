package p04;

public class Start {

	public static void main(String[] args) {

		Tanaka tanaka = new Tanaka();
		
		tanaka.eat();
		tanaka.eat(tanaka.bucho+"部長に叙々苑の弁当");
		tanaka.eat(10000);

	}

}
