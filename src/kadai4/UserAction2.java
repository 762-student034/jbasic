package kadai4;

import java.util.Scanner;

public class UserAction2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Userオブジェクトを生成し変数userに代入する
		User user = new User();
		System.out.println("名前: ");
		String name = scan.nextLine();
		System.out.println("年齢: ");
		int age = scan.nextInt();
		
		user.setName(name);
		user.setAge(age);	
		
		System.out.println("---");
		System.out.println("会員を登録しました");
		
		//userの情報を出力する
		user.showInfo();
		
		scan.close();
		
	}

}
