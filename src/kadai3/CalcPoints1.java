package kadai3;

public class CalcPoints1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int price = 1000;
		// プレミア会員のポイント計算
		int p1 = (int)Member.getPoints(price, true);
		System.out.println("プレミア会員には" + p1 + "ポイント付与されます");
		
		// 無料会員のポイント計算
		int p2 = Member.getPoints(price, 1);
		System.out.println("無料会員には" + p2 + "ポイント付与されます");
	}

}
