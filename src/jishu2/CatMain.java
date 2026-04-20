package jishu2;

public class CatMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cat coffee = new Cat("Nil", "キジトラ", 15, "バリバリ餌");
		coffee.setName("Coffee");
		
		
		System.out.println("猫の名前は"+coffee.getName()+"。");
		System.out.println("猫の柄は"+coffee.getBreed()+"。");
		System.out.println("猫の年齢は"+coffee.getAge()+"。");
		System.out.println("猫がお気に入り食べ物はは"+coffee.getFavFood()+"。");		
	}

}
