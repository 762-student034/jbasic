package kadai8.Actor;

public class Hero extends Actor{
	
	public Hero() {
		super();
	}
	
	public Hero(int hp, int attack) {
		super("🦸勇者", hp, attack);
	}
	
	@Override
	public void attack(Actor target) {
		partition();
		System.out.println(getName() + "は剣で切りつけた");
		int targetNewHp = target.getHp() - getAttack();
		if (targetNewHp < 0) {
			target.setHp(0);
		} else {
			target.setHp(targetNewHp);
		}
		System.out.println("  "+target.getName() + "に"+getAttack()+"のダメージを与えた！");
		System.out.println("  "+target.toString());
		
	}

}
