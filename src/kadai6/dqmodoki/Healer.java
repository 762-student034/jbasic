package kadai6.dqmodoki;

public class Healer extends Character implements Healable{
	public Healer() {
		}
	
	public Healer(String name) {
		super(name);
	}
	
	@Override
	public void info() {
		System.out.println("ヒーラー: "+getName());
	}

	@Override
	public void heal() {
		System.out.println(getName()+"(ヒーラー)は回復した！");
	}
}
