package kadai4;

import java.util.Scanner;

public class UseConvert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input1;
        while (true) {
            System.out.print("整数を入力して下さい：");
            try {
                input1 = scan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("整数を入力してください。");
                scan.nextInt();
            }
        }
        Convert.reverse(input1);

        double input2;
        while (true) {
            System.out.print("浮動小数点数を入力して下さい：");
            try {
                input2 = scan.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("浮動小数点数を入力してください。");
                scan.nextDouble();
            }
        }
        Convert.reverse(input2);

        String input3;
        while (true) {
            System.out.print("文字列を入力して下さい：");
            input3 = scan.nextLine();
            if (Convert.verify(input3)) {
                break;
            } else {
                System.out.println("文字列が不正です。再入力してください。");
            }
        }
        Convert.reverse(input3);

        scan.close();
    }
}
