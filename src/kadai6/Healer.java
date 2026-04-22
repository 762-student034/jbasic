package kadai6;

public class Healer extends Character implements Healable{
	public Healer() {
		super();	
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
