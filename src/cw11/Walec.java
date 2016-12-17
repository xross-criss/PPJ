package cw11;

public class Walec {
    private double r, h;
    double pi = 3.14;

    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void show() {
        double polepowpodst = pi * (Math.pow(r, 2));
        double objetoscwalca = pi * (Math.pow(r, 2)) * h;

        System.out.println("Pole powierzchni podstawy walca to: " + polepowpodst + ", a objetość walca to: " + objetoscwalca);
    }
}
