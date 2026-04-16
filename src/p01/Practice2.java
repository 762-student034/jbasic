package p01;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("マスターマインドゲーム");
        System.out.println("數を入力してください: ");
        int size = scan.nextInt();
        System.out.println(size+"桁の数字を当ててください（0〜9、重複なし）");
        Mastermind game = new Mastermind(size);

        // DEBUG: show code
//        System.out.println("答え（デバッグ用）: " + Arrays.toString(game.getCode()));

        while (true) {
            System.out.print("入力: ");
            String input = scan.nextLine();

            // Validate input
            if (input.length() != size || !input.matches("\\d{"+size+"}")) {
                System.out.println(size+"桁の数字を入力してください");
                continue;
            }

            // Convert to int[]
            int[] guess = new int[size];
            for (int i = 0; i < size; i++) {
                guess[i] = input.charAt(i) - '0';
            }

            // Check guess
            int[] result = game.checkGuess(guess);
            int hits = result[0];
            int near = result[1];

            System.out.println("ヒット: " + hits + " / ニア: " + near);

            if (hits == size) {
                System.out.println("正解です！おめでとう！");
                break;
            }
        }

        scan.close();
    }
}
