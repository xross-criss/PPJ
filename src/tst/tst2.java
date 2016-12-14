package tst;

/*
Uzupełnij ciało poniższej metody, tak aby zwracała wartość true gdy dostarczony argument zawiera znaki reprezentujące liczby lub wartość false w przeciwnym przypadku
public boolean metoda(char[] slowo){}
*/

public class tst2 {
    public static void main(String[] args) {

    }

    public boolean metoda(char[] slowo) {
        boolean ToF = false;

        for (int i = 0; i < slowo.length; i++) {
            if(slowo[i] < 48 || slowo[i] >  57){
                ToF = true;
            }
        }

        return ToF;
    }
}
