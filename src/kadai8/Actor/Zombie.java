package kadai8.Actor;

public class Zombie extends Actor {

	public Zombie() {
		super();
	}

	public Zombie(int hp, int attack) {
		super("🧟‍♀️ゾンビ", hp, attack);
	}

	@Override
	public void attack(Actor target) {
		partition();
		System.out.println(getName() + "の体当たり");
		int targetNewHp = target.getHp() - getAttack();
		if (targetNewHp < 0) {
			target.setHp(0);
		} else {
			target.setHp(targetNewHp);
		}
		System.out.println("  " + target.getName() + "に" + getAttack() + "のダメージを与えた！");
		System.out.println("  " + target.toString());

	}
}
