//(padding) Írj egy függvényt ami egy karakterláncot kiegészít adott hosszúságúra.
// A függvény paraméterként várja a kiegészítendő karakterláncot,
// a kiegészítéshez használatos karaktert, az elérni kívánt hosszt valamint azt,
// hogy a karakterlánc elejére vagy végére kerüljenek a kitöltő karakterek.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy karakterlancot");
        String sKarakterlanc = sc.nextLine();
        System.out.println("Adjon meg a kiegesziteshez hasznalatos karaktert");
        String sKarakter = sc.nextLine();
        System.out.println("Adjon meg az elerni kivant hosszt");
        int Szohossz = sc.nextInt();
        sc.nextLine();
        System.out.println("Adja meg hogy hova szeretne kiegesziteni [Eleje], [Vegere] ");
        String Bemenet = sc.nextLine();

        sKarakterkiegeszto(sKarakterlanc,sKarakter,Szohossz,Bemenet);

    }

    private static void sKarakterkiegeszto(String BemenoKarakterlanc, String KiegesziteshezHasznaltKarakter, int KivantSzohossz, String UjKarakterPozicioja) {
        int iKarakterszamlaloEleje = 0;
        int iSzohosszKulonbseg = KivantSzohossz - BemenoKarakterlanc.length();
        int iKarakterszamlaloVege = BemenoKarakterlanc.length();
        String[] sUjKatakterlancTomb = new String[KivantSzohossz];
        String[] sKarakterlanc = new String[BemenoKarakterlanc.length()];
        for (int i = 0; i < BemenoKarakterlanc.length(); i++) {
            sKarakterlanc[i] = String.valueOf(BemenoKarakterlanc.charAt(i));
        }
        if (UjKarakterPozicioja.equals("Eleje")) {
            for (int i = 0; i < iSzohosszKulonbseg; i++) {
                sUjKatakterlancTomb[i] = KiegesziteshezHasznaltKarakter;
                iKarakterszamlaloEleje++;
            }
            for (int i = 0; i < BemenoKarakterlanc.length(); i++) {
                sUjKatakterlancTomb[iKarakterszamlaloEleje] = sKarakterlanc[i];
                iKarakterszamlaloEleje++;
            }
            for (int i = 0; i < sUjKatakterlancTomb.length; i++) {
                System.out.print(sUjKatakterlancTomb[i]);
            }
        } else {
            for (int i = 0; i < iSzohosszKulonbseg; i++) {
                sUjKatakterlancTomb[iKarakterszamlaloVege] = KiegesziteshezHasznaltKarakter;
                iKarakterszamlaloVege++;
            }
            for (int i = 0; i < BemenoKarakterlanc.length(); i++) {
                sUjKatakterlancTomb[i] = sKarakterlanc[i];
            }
            for (int i = 0; i < sUjKatakterlancTomb.length; i++) {

                System.out.print(sUjKatakterlancTomb[i]);

            }

        }
    }


}