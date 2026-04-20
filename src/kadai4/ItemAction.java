package kadai4;

public class ItemAction {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Item item = new Item();
		item.setName("絵本");
		item.setPrice(1000);
		String name = item.getName();
		int price = item.getPrice();

		System.out.println("名前： " + name);
		System.out.println("価格： " + price);

		//Step2の処理
		System.out.println("---");

		//Step3の処理
		// Itemクラスのオブジェクトを生成し変数item2に代入する
		Item item2 = new Item();

		// item2のフィールドに商品名「シャンプー」、価格「222」を設定する
		item2.setName("シャンプー");
		item2.setPrice(222);

		// showInfo()メソッドを利用して情報を出力する
		item2.showInfo();

	}

}
