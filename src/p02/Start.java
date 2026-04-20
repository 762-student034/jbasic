package p02;

public class Start {

	public static void main(String[] args) {
		Human tanaka = new Human();
			
		tanaka.setName("山田太郎");
		tanaka.setAge(23);
		
		tanaka.introduce();
		tanaka.talk();
		tanaka.eat();
	}

}
