package cw5;

public class z1 {
    public static void main(String[] args) {
        boolean czyPada = false;
        boolean czySwieciSlonce = false;

        if (czyPada && czySwieciSlonce) {
            System.out.println("tęcza");
        } else if (czyPada && !czySwieciSlonce) {
            System.out.println("plucha");
        } else if (!czyPada && czySwieciSlonce) {
            System.out.println("słonecznie");
        } else if (!czyPada && !czySwieciSlonce) {
            System.out.println("pochmurno");
        }


        int zmienna = 0;

        if (czyPada) {
            zmienna = 5;
        } else {
            zmienna = 8;
        }

        System.out.println(zmienna);
    }
}
