package kadai6;

public class Monk extends Character implements Attackable, Healable {
public Monk() {
	super();
}
public Monk(String name) {
	super(name);
}	

@Override
public void info() {
	System.out.println("僧侶: "+getName());
}

@Override
public void attack() {
	System.out.println(getName()+"(僧侶)は攻撃した！");
}

@Override
public void heal() {
	System.out.println(getName()+"(僧侶)は回復した！");
}
	
}
