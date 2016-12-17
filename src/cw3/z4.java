package cw3;

public class z4 {
    public static void main(String[] args) {
        int liczba = 0;
        String zbior = liczba < 0 ? "zbiór B" : liczba ==0 ? "Zbiór ABC" : liczba <= 1? "zbiór A i zbiór C" : "zbiór A" ;

        System.out.println(zbior);
    }
}
