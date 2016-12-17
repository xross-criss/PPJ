package cw7;

import java.util.Random;

public class z4 {
    public static void main(String[] args) {

        int[] tab = new int[10];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) Math.round(Math.random());
            sb.append(tab[i] + " ");
        }

        System.out.println(sb);

        //checking
        int counter = 0;

        for (int i = 0; i < tab.length-2; i++) {
            if (i > tab.length - 2) {
                continue;
            } else {
                if (tab[i] == 1) {
                    if (tab[i + 1] == 0) {
                        if (tab[i + 2] == 1) {
                            counter++;
                        }
                    }
                }
            }
        }


        System.out.println(counter);
    }
}
