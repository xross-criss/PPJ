package cw9;

public class z1 {

    public static void main(String[] args) {
        rysuj(5, 'o');
    }

    private static void rysuj(int iloscZnakow, char znak) {
        char o = 'o';
        char x = 'x';
        boolean first = false;

        if (o == znak) {
            first = true;
        } else if (x == znak) {
            first = false;
        }

        int position = 0;

        for (int i = 0; i < iloscZnakow; i++) {
            for (int j = 0; j < iloscZnakow; j++) {

                if (position % 2 == 0) {
                    if (first) {
                        System.out.print(o);
                    } else if (!first) {
                        System.out.print(x);
                    }
                } else if (position % 2 != 0) {
                    if (first) {
                        System.out.print(x);
                    } else if (!first) {
                        System.out.print(o);
                    }
                }
                position++;

            }
            System.out.print('\n');
        }

    }

}
