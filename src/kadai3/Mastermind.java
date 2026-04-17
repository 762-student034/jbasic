package kadai3;

import java.util.Random;

public class Mastermind {
    private int[] code;
    private boolean[] used;
    private int size;
    private Random rand = new Random();

    public Mastermind(int size) {
        this.size = size;
        this.code = new int[size];
        this.used = new boolean[10];
        generateCode();
    }

    private void generateCode() {
        for (int i = 0; i < size; i++) {
            int number = rand.nextInt(10);
            while (used[number]) {
                number = rand.nextInt(10);
            }
            code[i] = number;
            used[number] = true;
        }
    }

    public int[] getCode() {
        return code;
    }

    public int[] checkGuess(int[] guess) {
        int hits = 0;
        int near = 0;

        // Create a fresh used[] for checking
        boolean[] codeUsed = new boolean[10];
        for (int n : code) codeUsed[n] = true;

        for (int i = 0; i < size; i++) {
            if (guess[i] == code[i]) {
                hits++;
            } else if (codeUsed[guess[i]]) {
                near++;
            }
        }

        return new int[]{hits, near};
    }
}
