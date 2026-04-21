package kadai5;

public class ItemAction1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Itemクラスのオブジェクトを生成し変数item1に代入する
		Item item1 = new Item();
		
		// セッターを利用して情報（絵本/1000円）をセットする	
		item1.setName("絵本");
		item1.setPrice(1000);
		
		// ゲッターを利用して商品の情報を出力する
		System.out.println("名前： " + item1.getName());
		System.out.println("価格： " + item1.getPrice()+"円");

		
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
