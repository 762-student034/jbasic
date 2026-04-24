package test034;

import java.util.HashMap;
import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();

		menu(map, sc);
	}

	public static void menu(HashMap<String, String> map, Scanner sc) {
		int s;
		while (true) {
			System.out.println("1: 登録");
			System.out.println("2: 削除");
			System.out.println("3: 一覧表示");
			System.out.println("9: 終了");
			System.out.println("操作番号を入力してください: ");

			s = verifyInt(sc);

			switch (s) {
			case 1 -> addInfo(map, sc);
			case 2 -> deleteInfo(map, sc);
			case 3 -> showInfo(map);
			case 9 -> {
				System.out.println("アプリケーションを終了します");
				System.exit(0);
			}
			default -> System.out.println("1, 2, 3, 9を入力してください。");

			}
		}
	}

	public static HashMap<String, String> addInfo(HashMap<String, String> map, Scanner sc) {
		System.out.println("名前を入力してください: ");
		String name = sc.nextLine();
		System.out.println("電話番号を入力してください: ");
		String no = sc.nextLine();
		map.put(name, no);

		return map;
	}

	public static void showInfo(HashMap<String, String> map) {
		System.out.println("名前         電話番号\n---------------------------");
		for (String i : map.keySet()) {
			System.out.println(i + "            " + map.get(i));
		}
	}

	public static HashMap<String, String> deleteInfo(HashMap<String, String> map, Scanner sc) {
		System.out.println("名前を入力してください： ");
		String key = sc.nextLine();
		
		if (map.containsKey(key)) {
			map.remove(key);
		}	else {
			System.out.println(key+"の記録はありません。");
		}
		return map;
	}

	public static int verifyInt(Scanner scan) {
		while (true) {
			String input = scan.nextLine();
			try {
				return Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("整数の数字を入力してください。");
			}
		}
	}
}
