package kadai8.Actor;

import java.util.ArrayList;
import java.util.List;

public class Game {

	public static void main(String[] args) {

		System.out.println("★★★ゲーム開始★★★");
		

		//オブジェクトの生成（名前：勇者、生命力：50、攻撃力：10)
		Hero y = new Hero(10, 5);

		// 勇者の情報の表示
		System.out.println(y.toString());
		
		//オブジェクトの生成（名前：ゾンビ、生命力：15、攻撃力：5)
		Zombie z = new Zombie(15, 5);

		// ゾンビの情報の表示
		System.out.println(z.toString());

		//攻撃
		List<Actor> enemies = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			enemies.add(Actor.randomEnemy());
		}
		
		for (Actor a: enemies) {
		Actor.battle(y,a, enemies);
		
		}
	}
}
