package kadai3;

import java.util.Scanner;

public class UserRegistration1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = "";
        int age = 0;

        // 名前入力
        while (true) {
            System.out.print("名前を入力してください：");
            name = scan.next();   // assign to existing variable
            if (Person.hasNameError(name)) {
                break;
            }
        }

        // 年齢入力
        while (true) {
            System.out.print("年齢を入力してください：");
            String ageInput = scan.next();
            try {
                age = Integer.parseInt(ageInput);
                if (Person.hasAgeError(age)) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("整数を入力してください。");
            }
        }

        System.out.println("名前：" + name + "、年齢：" + age + "で登録しました。");
        scan.close();
    }
}
