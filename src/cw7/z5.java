package cw7;

public class z5 {
    public static void main(String[] args) {
        char[] array = {'K', 'r', 'z', 'y', 's', 'i', 'e', 'k'};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] += i;
        }
        System.out.print("\nSlowo zaszyfrowane: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] -= i;
        }
        System.out.print("\nSlowo odszyfrowane: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

    }
}
