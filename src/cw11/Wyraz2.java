package cw11;

public class Wyraz2 {
    private String wyrazek2;
    private int dlugosc2;

    private Wyraz2 wyr;

    public Wyraz2(String wyrazek2) {
        this.wyrazek2 = wyrazek2;
    }

    public void setNastepnyWyraz(String nastepnyWyraz) {
        this.wyr = new Wyraz2(nastepnyWyraz);
    }

    public void show() {
        System.out.println(wyrazek2);

        if(wyr != null){
            wyr.show();
        }
    }

    public void setNastepnyWyraz() {
        wyr = null;
    }
}
