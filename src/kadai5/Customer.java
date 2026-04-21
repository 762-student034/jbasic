package kadai5;

import java.util.Scanner;

public class Customer {

	private int id;
	private String name;

	public Customer() {
		id = 0;
		name = "Unknown";
	}

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Customer(String name) {
		id = -1;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void showData() {
		System.out.println(id + " : " + name);
	}

	// 全件表示
	public void showAll(Customer[] customerList) {
		System.out.println("\n=== 顧客データ一覧 ===");
		for (Customer c : customerList) {
			c.showData();
		}
	}

	// データ更新
	public void updateData(Customer[] customerList) {
		Scanner scan = new Scanner(System.in);

		System.out.print("更新するID: ");
		int targetId = scan.nextInt();
		scan.nextLine();

		for (Customer c : customerList) {
			if (c.getId() == targetId) {

				System.out.print("新しいID: ");
				int newId = scan.nextInt();
				scan.nextLine();

				System.out.print("新しい名前: ");
				String newName = scan.nextLine();

				c.setId(newId);
				c.setName(newName);

				System.out.println("更新しました。");
				return;
			}
		}

		System.out.println("指定したIDは存在しません。");
	}

	public void updateData(String name) {
		setName(name);
	}

	public void updateData(int id, String name) {
		setId(id);
		setName(name);
	}

	// メニュー操作
	public void operation(int mode, Customer[] customerList) {
		switch (mode) {
		case 1:
			showAll(customerList);
			break;
		case 2:
			updateData(customerList);
			break;
		case 9:
			System.out.println("終了します。");
			System.exit(0);
		}
	}
}
