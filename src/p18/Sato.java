package p18;

public class Sato extends Human {

	public Sato(String name, int age) {
		super(name, age);
	}

	public void playPiano() {
		System.out.println("名前は" + getName() + "ですよ！");
		System.out.println("年齢は" + getAge() + "ですよ！");
		System.out.println("ピアノを引いています。");
		System.out.println();
	}
	
	@Override
	public void eat() {
//		super.eat();
		System.out.println("優雅のわたくしはパスタをいただきました。");
	}

}
