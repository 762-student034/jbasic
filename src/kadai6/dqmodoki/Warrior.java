package kadai6.dqmodoki;

public class Warrior extends Character implements Attackable{
	public Warrior() {
	}
	
	public Warrior(String name) {
		super(name);
	}
	
	@Override
	public void info(){
		System.out.println("戦士: "+getName());
	}
	
	@Override
	public void attack() {
		System.out.println(getName()+"(戦士)は攻撃した!");

	}

}
