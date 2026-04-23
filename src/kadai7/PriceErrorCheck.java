package kadai7;

import java.util.Scanner;

import InputVerify.ValidateInput;

public class PriceErrorCheck {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ValidateInput v = new ValidateInput();
	
	int price=0;
	System.out.println("価格: "+price);
	
	//整数チェック
	price = ValidateInput.verifyRange(sc);	
	
	System.out.println(price + "円を登録しました");
	sc.close();
	}

}
