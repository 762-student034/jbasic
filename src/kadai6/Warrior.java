package kadai6;

public class Warrior extends Character implements Attackable{
	public Warrior() {
		super();
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
