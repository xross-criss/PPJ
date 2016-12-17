package cw11;

public class Wyraz {
    private String wyrazek;
    private int dlugosc;

    public Wyraz(String wyrazek) {
        this.wyrazek = wyrazek;
    }

    public Wyraz() {
        wyrazek = "";
    }

    public void dodajZnak(char b) {
        wyrazek += b;
    }

    @Override
    public String toString() {
        return wyrazek;
    }

    public int length() {
        dlugosc = wyrazek.length();
        return dlugosc;
    }
}
