package cw5;

public class z6 {
    public static void main(String[] args) {
        double n = 0;
        double suma = 0;

        for (double i = n; i < 10; i++) {
            double wynik = (1 / (Math.pow(2, i)));
            suma += wynik;
        }
        System.out.println(suma);
    }
}
