import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String K1 = "zbrabrabra";
        String K2 = "abra";
        int K1Hossz = K1.length();
        int K2Hossz = K2.length();
        int SzovegKulonbseg = K1Hossz / K2Hossz;
        String[] eSzoveg = new String[K1Hossz];
        String[] eSzoveg2 = new String[K2Hossz];
        for (int i = 0; i < K1Hossz; i++) {
            eSzoveg[i] = String.valueOf(K1.charAt(i));

        }
        for (int i = 0; i < K2Hossz; i++) {
            eSzoveg2[i] = String.valueOf(K2.charAt(i));
        }

        for (int i = 0; i < K2Hossz; i++) {
            int Hasonlitasiertek = eSzoveg[i].compareToIgnoreCase(eSzoveg2[i]);
            if (Hasonlitasiertek == 0){
                continue;
            }

            System.out.println("cc");



        }String []Uj =new String[K2Hossz];
        for (int i = 0; i <K2Hossz ; i++) {
            Uj [i] = String.valueOf(K1.charAt(i+4));
            int Hasonlitasiertek = Uj[i].compareToIgnoreCase(eSzoveg2[i]);
            if (Hasonlitasiertek == 0){
                continue;
            }System.out.println("c");

        }

        System.out.println("ss");


    }


}

