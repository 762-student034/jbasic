package kadai8.Actor;

public class Ghost extends Actor {

	public Ghost() {
		super();
	}

	public Ghost(int hp, int attack) {
		super("👻ゴースト", hp, attack);
	}

	@Override
	public void attack(Actor target) {
		partition();
		System.out.println(getName() + "叫び声！");
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
