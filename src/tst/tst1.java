package tst;

/*Uzupełnij ciało metody
public int[] metoda (int[][] slowo){
        }
, tak aby zwracana była przekątna tablicy gdy suma elementów tej tablicy jest nieparzysta lub suma elementów środkowej kolumny w przeciwnym przypadku.*/

public class tst1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        int[][] tab = new int[a][b];

        int cyfra = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                tab[i][j] = cyfra;
                cyfra++;
            }
        }
        //TODO - dopisać wyświetlenie tamtej tablicy (?)
    }


    public int[] metoda(int[][] slowo) {
        int a = slowo.length;
        int b = slowo[0].length;

        int d = (a + b) / 2;
        int[] przekszt = new int[d];

        int sumaTab = 0;
        int[] sum = new int[1];
        int sumaelem = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sumaTab += slowo[i][j];
            }
        }

        if (sumaTab % 2 != 0) {
            for (int i = 0; i < d; i++) {
                przekszt[i] = slowo[i][i];
            }

            return przekszt;

        } else {
            for (int i = 0; i < a; i++) {
                sumaelem += slowo[i][b / 2];
            }
            sum[0] = sumaelem;
            return sum;
        }


    }
}