package p18;

public class Start {

	public static void main(String[] args) {
		
		Human h;

		h = new Ogawa("小川", 23);

		h = new Sato("佐藤", 22);

		System.out.print(h.getName() + "は");
		h.eat();
		//		h.playSoccer();
		System.out.print(h.getName() + "は");
		h.eat();
		//		h.playPiano();

	}
}
