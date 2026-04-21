package kadai4;

public class ItemAction {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Itemクラスのオブジェクトを生成し変数item1に代入する
		Item item1 = new Item();
		
		// item1のフィールドに商品名「絵本」、価格「1000」を設定する
		item1.setName("絵本");
		item1.setPrice(1000);
		
		// item1を利用して商品名と価格の情報を出力する
		String name = item1.getName();
		int price = item1.getPrice();

		System.out.println("名前： " + name);
		System.out.println("価格： " + price+"円");

		
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
