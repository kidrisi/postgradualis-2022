import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sElsoKarakter = "gehellet";
        String sMasodikKarakter = "lhht";
        int iElsohossz = sElsoKarakter.length();
        int iMasodikhossz = sMasodikKarakter.length();
        //int SzovegKulonbseg = iElsohossz / iMasodikhossz;
        String[] sElsoszoveg = new String[iElsohossz];
        String[] sMasodikszoveg = new String[iMasodikhossz];
        for (int i = 0; i < iElsohossz; i++) {
            sElsoszoveg[i] = String.valueOf(sElsoKarakter.charAt(i));
        }
        for (int i = 0; i < iMasodikhossz; i++) {
            sMasodikszoveg[i] = String.valueOf(sMasodikKarakter.charAt(i));
        }
        String[]sElsoreszdarab = new String[iMasodikhossz];
        for (int i = 0; i < iMasodikhossz; i++) {
            sElsoreszdarab[i]=String.valueOf(sElsoKarakter.charAt(i));
            int Osszehason = sElsoreszdarab[i].compareToIgnoreCase(sMasodikszoveg[i]);
            if (Osszehason!= 0) {
                continue;
            }System.out.println("e");

        }

        int e = 0;
        e++;
        //System.out.println(sElsoszoveg[e]);

        if (sElsoszoveg[e] != sMasodikszoveg[e]) {
            // e++;
            System.out.println(sElsoszoveg[e] +" "+  sMasodikszoveg[e]);

        }


        {

//        for (int i = 0; i < iMasodikhossz; i++) {
//            int iOsszehasonlitas = sElsoszoveg[i].compareToIgnoreCase(sMasodikszoveg[i]);
//            if (iOsszehasonlitas == 0) {
//                continue;
//
//            }System.out.println(" r");

        }

    }
}




