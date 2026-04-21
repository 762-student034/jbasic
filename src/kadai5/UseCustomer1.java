package kadai5;

import java.util.Scanner;

public class UseCustomer1 {

	public static void main(String[] args) {

		Customer[] customerList = new Customer[3];
		Scanner scan = new Scanner(System.in);
		int id;
		String name;
		
		// 顧客データの読み込み
		for (int i = 0; i < customerList.length; i++) {
			System.out.println((i + 1) + "人目の顧客情報を入力してください。");

			System.out.print("ID（指定しない場合は-1と入力）：");
			while (true) {
				try {
					id = scan.nextInt();
					break; 
				} catch (Exception e) {
					System.out.println("整数を入力してください。");
					scan.nextInt(); 
				}
			}


			System.out.print("名前：");
			while (true) {
				name = scan.next();
				if (name.trim().isEmpty()) {
					System.out.println("空白不可です。文字を入力してください。");
				} else {
					break;
				}
			}

			Customer customer = new Customer();
			if (id == -1) {
				customer.updateData(name);
			} else {
				customer.updateData(id, name); 
			}
			customerList[i] = customer;
		}

		//顧客データ表示
		System.out.println();
		System.out.println("=== 顧客データ一覧 ===");
		for (Customer customer : customerList) {
			customer.showData();
		}

		scan.close();
	}
}
