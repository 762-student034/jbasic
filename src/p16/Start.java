package p16;

public class Start {

	public static void main(String[] args) {

		Sato s = new Sato("佐藤", 22);
		Ogawa o = new Ogawa("小川", 23);
		
		System.out.print(o.getName()+"は");
		o.eat();
		o.playSoccer();
		
		System.out.print(s.getName()+"は");
		s.eat();
		s.playPiano();
		


	}
}
