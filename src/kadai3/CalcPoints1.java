package kadai3;

public class CalcPoints1 {

    public static void main(String[] args) {

        int price = 1000;

        // プレミア会員
        Member premiumMember = new Member(true);
        int p1 = premiumMember.addPoints(price);
        System.out.println("プレミア会員には" + p1 + "ポイント付与されます");

        // 無料会員
        Member freeMember = new Member(false);
        int p2 = freeMember.addPoints(price);
        System.out.println("無料会員には" + p2 + "ポイント付与されます");
    }
}
