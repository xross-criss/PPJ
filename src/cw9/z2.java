package cw9;

import java.util.Random;

public class z2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        int max = 57, min = 48;

        char[][] tab = new char[a][b];

        Random random = new Random();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                tab[i][j] = (char) (random.nextInt(max - min + 1) + min);
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }

    }
}
