package cw5;

public class z7 {
    public static void main(String[] args) {
        int licznik = 0;
        int liczba = 2;
        int x = 0;
        int ilosc = 10;

        if (licznik == 10) {
            System.out.println("TAK");
        } else {
            while (licznik != 10) {
                x = 2;
                if (liczba % x == 0) {
                    if (liczba == x) {
                        System.out.println("JEST PIERWSZA: " + liczba);
                        licznik += 1;
                        liczba += 1;
                    } else {
                        liczba = +1;
                    }
                } else {
                    x += 1;
                }
            }
            System.out.println("pętla zakończona, odpowiedź: TAK");
        }
    }

/*        int i, j, zakres, pierwiastek;
        zakres = 10;
        int tablica[] = new int[zakres+1];
        pierwiastek = (int) Math.floor(Math.sqrt(zakres));

        for (i = 1; i <= zakres; i++) tablica[i] = i;

        for (i = 2; i <= pierwiastek; i++) {
            if (tablica[i] != 0) {
                j = i + i;
                while (j <= zakres) {
                    tablica[j] = 0;
                    j += i;
                }
            }
        }

        System.out.println("Liczby pierwsze z zakresu od 1 do " + zakres);
        for (i = 2; i <= zakres; i++) if (tablica[i] != 0) System.out.print(i + ", ");
    }*/
}