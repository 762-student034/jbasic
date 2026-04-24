package p18;

public class Ogawa extends Human {

	public Ogawa(String name, int age) {
		super(name, age);
	}

	public void playSoccer() {
		System.out.println("名前は" + getName() + "だよ！");
		System.out.println("年齢は" + getAge() + "だよ！");
		System.out.println("相手のゴールにシューーーーーッ");
		System.out.println();

	}
	
	@Override
	public void eat(){
//		super.eat();
		System.out.println("うどんを食べました。");
	}
}
