package p04;

public class Start {

	public static void main(String[] args) {

		Tanaka yamada = new Tanaka("山田太郎", 23,"荒川", "エフ");
		
		yamada.introduce();
		
		Human h2 = new Human();

		System.out.println("----------");
		h2.setName("コミー");
		h2.setAge(13);
		h2.introduce();
	}

}
