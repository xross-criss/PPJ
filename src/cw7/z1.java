package cw7;

public class z1 {
    public static void main(String[] args) {
        String[] slowa = {"Ala", "kota", "ma", "ma", "a", "kot", "Ale"};

        StringBuilder sb = new StringBuilder();
        sb.append(slowa[0] + " ");
        sb.append(slowa[2] + " ");
        sb.append(slowa[1] + " ");
        sb.append(slowa[4] + " ");
        sb.append(slowa[5] + " ");
        sb.append(slowa[3] + " ");
        sb.append(slowa[6] + " ");
        System.out.println(sb.toString());

        char[] znaki = sb.toString().toCharArray();
        int coutner = 0;

        for (int i = 0; i < znaki.length; i++) {
            if (znaki[i] == 'a') {
                coutner++;
            } else {
                continue;
            }
        }
        System.out.println("W tablicy policzono: " + coutner + " wystąpień 'a'");

    }
}
