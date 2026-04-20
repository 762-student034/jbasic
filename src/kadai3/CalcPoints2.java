package kadai3;

import java.util.Scanner;

public class CalcPoints2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("購入金額：");
		int price = scan.nextInt();
		System.out.println("1:プレミア会員, 2:無料会員");
		System.out.print("会員ランク：");
		int rank = scan.nextInt();
		rank -= rank;

		if (rank == 0) {
			// 無料会員のポイント計算
			int p1 = Member.getPoints(price, rank);
			System.out.println("無料会員には" + p1 + "ポイント付与されます");
		} else if (rank == 1) {
			int p2 = Member.getPoints(price, rank);
			System.out.println("プレミア会員には" + p2 + "ポイント付与されます");
		}
		scan.close();
	}

}
