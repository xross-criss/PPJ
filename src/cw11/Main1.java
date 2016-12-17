package cw11;

public class Main1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;


        Kwadrat kwadrat = new Kwadrat(a);
        kwadrat.show();

        Walec walec = new Walec(a, b);
        walec.show();

        kwadrat.przygotujWalec();

        //===============================================

        Wyraz wyraz = new Wyraz();
        System.out.println("Wyraz to: " + wyraz.toString() + ", o dlugosci: " + wyraz.length());

        wyraz = new Wyraz("Tralala");
        System.out.println("Wyraz to: " + wyraz.toString() + ", o dlugosci: " + wyraz.length());

        wyraz.dodajZnak('b');
        System.out.println("Wyraz to: " + wyraz.toString() + ", o dlugosci: " + wyraz.length());

        //==============================================

        Wyraz2 wyraz2 = new Wyraz2("Ala ma kota");

        wyraz2.setNastepnyWyraz("a kot ma Ale");

        wyraz2.show();

    }
}
