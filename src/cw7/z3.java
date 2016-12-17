package cw7;

public class z3 {
    public static void main(String[] args) {
        int[] tab = new int[20];

        for (int i = 0; i < tab.length - 1; i++) {
            tab[i] = (int) (Math.random() * 10);
        }

        int half = 19 / 2;
        int[] cp = tab.clone();

        for (int i = 0; i < tab.length; i++) {
            if (i < half) {
                continue;
            } else if (i == half) {
                tab[i] = -1;
            } else {
                tab[i] = cp[i - 1];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tab.length; i++) {
            sb.append(tab[i] + " ");
        }
        System.out.println(sb);
    }
}
