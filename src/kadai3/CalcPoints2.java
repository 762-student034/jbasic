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
		
		if (rank == 1) {
			Member premiumMember = new Member(true);
			int p2 = premiumMember.addPoints(price);
			System.out.println("プレミア会員には" + p2 + "ポイント付与されます");

		} else if (rank == 2) {
			Member freeMember = new Member(false);
			// 無料会員のポイント計算
			int p1 = freeMember.addPoints(price);
			System.out.println("無料会員には" + p1 + "ポイント付与されます");
		}
		scan.close();
	}

}
