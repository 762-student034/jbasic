package kadai6.dqmodoki;

import java.util.Scanner;

public class ValidateInput {
	public static int getValidatedInput(Scanner scan) {
	    while (true) {
	        String input = scan.nextLine();

	        try {
	            int value = Integer.parseInt(input);
	            
	            switch (value) {
				case 1, 2, 3, 9 -> {
					return value;
				}
				default -> System.out.println("無効な入力です。");
				}
	        } catch (NumberFormatException e) {
	            System.out.println("数字を入力してください。");
	        }
	        System.out.println("操作（1:一覧表示 2:攻撃 3:回復 9:終了）を選択してください：");
	    }
	}
}
