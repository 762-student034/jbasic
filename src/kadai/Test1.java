package kadai;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("国語の点数を入力してください：");
		String kokugo = stringCheck(scan);
		System.out.println("数学の点数を入力してください：");
		String sugaku = stringCheck(scan);
		System.out.println("英語の点数を入力してください：");
		String eigo = stringCheck(scan);
		System.out.println("平均は"+average(kokugo,sugaku,eigo)+"です。");
		scan.close();
	}

	public static double average(String kokugo, String sugaku, String eigo) {

		double kokugoDbl = Double.parseDouble(kokugo) ;
		double sugakuDbl = Double.parseDouble(sugaku) ;
		double eigoDbl = Double.parseDouble(eigo) ;
		double avg = (kokugoDbl+sugakuDbl+eigoDbl)/3;
		return avg;
	}
	
	public static String stringCheck(Scanner scan) {
		String selection;

		while (true) {
			selection = scan.nextLine();

			try {
				Integer.parseInt(selection);
				return selection;
			} catch (NumberFormatException e) {
				System.out.println("数字を入力してください。");
			}
		}
	}
}