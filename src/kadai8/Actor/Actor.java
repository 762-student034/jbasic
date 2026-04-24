package kadai8.Actor;

import java.util.List;
import java.util.Random;

public class Actor {
	private String name;
	private int hp;
	private int attack;

	public Actor() {
		name = "Unknown";
		hp = 0;
		attack = 0;
	}

	public Actor(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public String toString() {
		String info;
		info = getName() + "(HP: " + getHp() + ")";
		return info;
	}

	public void attack(Actor target) {
		partition();
		System.out.println(getName() + "の攻撃");
		int targetNewHp = target.getHp() - getAttack();
		if (targetNewHp < 0) {
			target.setHp(0);
		} else {
			target.setHp(targetNewHp);
		}
		System.out.println("  " + target.getName() + "に" + getAttack() + "のダメージを与えた！");
		System.out.println("  " + target.toString());
	}

	public static Actor randomEnemy() {
		Actor[] spawner = {
				new Zombie(10, 5),
				new Zombie(20, 10),
				new Ghost(30, 15)
		};

		Random random = new Random();
		return spawner[random.nextInt(spawner.length)];
	}

	public static void battle(Actor y, Actor z, List<Actor> aList) {
		while (true) {
			if (aList.isEmpty()) {
				partition();
				System.out.println(z.getName() + "全ての敵を倒した！");
				partition();

			} else if (z.getHp() <= 0) {
				partition();
				aList.remove(z);
				System.out.println(z.getName() + "を倒しました!😊");
				partition();
				System.out.println("★★★ゲーム終了★★★");
				break;
			} else if (y.getHp() <= 0) {
				partition();
				System.out.println(y.getName() + "はやられてしまった...😂");
				partition();
				System.out.println("★★★ゲームオーバー★★★");
				break;
			}
			y.attack(z);
			z.attack(y);
		}
	}

	public static void partition() {
		System.out.print("---------\n");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("待機処理でエラーが発生しました");
		}
	}
}
