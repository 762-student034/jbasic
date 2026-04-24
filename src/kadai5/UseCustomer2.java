package kadai5;

import java.util.Scanner;

public class UseCustomer2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Customer[] list = new Customer[3];
        for (int i = 0; i < list.length; i++) {
            list[i] = new Customer();
        }
        
        for (int i = 0; i < list.length; i++) {
        System.out.println((i+1)+"人目の顧客情報を入力してください。\nID: ");
        list[i].setId(scan.nextInt());
        scan.nextLine();
        System.out.println("名前: ");
        list[i].setName(scan.nextLine());
        }

        Customer manager = new Customer();

        while (true) {
            System.out.println("操作(1: 顧客一覧表示 2: 顧客データ更新 9: 終了)を選択してください: ");
            int mode = scan.nextInt();
            manager.operation(mode, list);
        }
    }
}
