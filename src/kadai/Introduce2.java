package kadai;

import java.util.Scanner;

public class Introduce2{

    public static void main(String[] args) {
        Shumi shumi = input();   // get the Shumi object
        loop(shumi);             // pass it to loop()
    }

    public static Shumi input() {
        Scanner scan = new Scanner(System.in);

        System.out.println("情報を登録します\n名前: ");
        String name = scan.nextLine();

        System.out.println("趣味1： ");
        String hobby1 = scan.nextLine();

        System.out.println("趣味2： ");
        String hobby2 = scan.nextLine();

        System.out.println("趣味3： ");
        String hobby3 = scan.nextLine();

        return new Shumi(name, hobby1, hobby2, hobby3);
    }

    public static void loop(Shumi shumi) {
        shumi.introduce();   // simply call the method
    }
}
