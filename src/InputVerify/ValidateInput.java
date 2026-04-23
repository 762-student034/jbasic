package InputVerify;

import java.util.Scanner;

public class ValidateInput {

	public static String verify(Scanner scan, int maxLength) {
	    while (true) {
	        String input = scan.nextLine();

	        if (input.length() <= maxLength) {
	            return input;
	        }
	        System.out.println(maxLength + "文字以内で入力してください。");
	    }
	}

	
	public static int verify(Scanner scan) { //整数の確認
	    while (true) {
	        String input = scan.nextLine();
	        try {
	            return Integer.parseInt(input);
	        } catch (NumberFormatException e) {
	            System.out.println("整数の数字を入力してください。");
	        }
	    }
	}


	public static int verifyStr(Scanner scan) {
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
