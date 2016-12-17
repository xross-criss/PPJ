package cw11;

public class Kwadrat {

    private int a;

    public Kwadrat(int a) {
        this.a = a;
    }

    public void show() {
        int pole = (int) Math.pow(a, 2);
        int objetosc = (int) Math.pow(a, 3);

        System.out.println("Pole to: " + pole + ", a objętość to: " + objetosc);
    }

    public Walec przygotujWalec() {
        Walec walec = new Walec(a, (a/2));
        return walec;
    }
}
