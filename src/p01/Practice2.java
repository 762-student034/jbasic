package p01;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("マスターマインドゲーム");
        System.out.println("4桁の数字を当ててください（0〜9、重複なし）");

        Mastermind game = new Mastermind(4);

        // DEBUG: show code
        System.out.println("答え（デバッグ用）: " + Arrays.toString(game.getCode()));

        while (true) {
            System.out.print("入力: ");
            String input = scan.nextLine();

            // Validate input
            if (input.length() != 4 || !input.matches("\\d{4}")) {
                System.out.println("4桁の数字を入力してください");
                continue;
            }

            // Convert to int[]
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = input.charAt(i) - '0';
            }

            // Check guess
            int[] result = game.checkGuess(guess);
            int hits = result[0];
            int near = result[1];

            System.out.println("ヒット: " + hits + " / ニア: " + near);

            if (hits == 4) {
                System.out.println("正解です！おめでとう！");
                break;
            }
        }

        scan.close();
    }
}
