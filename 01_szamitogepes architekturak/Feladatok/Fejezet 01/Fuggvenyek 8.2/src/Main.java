//Oldd meg a 6.13 feladatot majd refaktoráld a megoldásodat,
// hogy függvények felhasználásával oldd meg,
// jelentősen csökkentve a kód mennyiségét és javítva az olvashatóságot.
//Használd az IDE beépített refaktorálási funkcióit (jobb klick, refactor, extract method).


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] iEgeszSzam = new int[10];
        Random Veletlen = new Random();
        int Tombpoziciomin = 0;
        int Tombpoziciomax = 0;
        int[] Eltaroltmaxertek = new int[1];
        System.out.println("_______________________");
        System.out.println("Veletlen szamok eredeti sorrendben:");
        System.out.println("_______________________");
        TizelemuTombVeletlenEgeszSzamokkalFeltoltes(iEgeszSzam, Veletlen);
        Tombpoziciomax = getTombpoziciomax(iEgeszSzam, Tombpoziciomax);
        Tombpoziciomin = getTombpoziciomin(iEgeszSzam, Tombpoziciomin);
        int[] MaximumErtek = new int[1];
        MaximumErtek[0] = iEgeszSzam[Tombpoziciomax];
        Eltaroltmaxertek[0] = iEgeszSzam[Tombpoziciomax];
        iEgeszSzam[Tombpoziciomax] = iEgeszSzam[Tombpoziciomin];
        iEgeszSzam[Tombpoziciomin] = Eltaroltmaxertek[0];
        System.out.println("_______________________");
        System.out.println("Veletlen szamok sorrendje a min es a max ertek helyeinek felcserelese utan:");
        System.out.println("_______________________");
        VesszoeltolasAszamokKiirasanalEgeszen9999ig(iEgeszSzam);
    }

    private static void VesszoeltolasAszamokKiirasanalEgeszen9999ig(int[] iEgeszSzam) {
        for (int i = 0; i < iEgeszSzam.length; i++) {
            if (iEgeszSzam[i] <= 9) {
                System.out.println(iEgeszSzam[i] + "    ,");
            } else if (iEgeszSzam[i] >= 10 && iEgeszSzam[i] <= 99) {
                System.out.println(iEgeszSzam[i] + "   ,");

            } else if (iEgeszSzam[i] >= 100 && iEgeszSzam[i] <= 999) {
                System.out.println(iEgeszSzam[i] + "  ,");

            } else {
                System.out.println(iEgeszSzam[i] + " ,");
            }
        }
    }

    private static int getTombpoziciomin(int[] iEgeszSzam, int Tombpoziciomin) {
        for (int i = 0; i < iEgeszSzam.length; i++) {
            if (iEgeszSzam[Tombpoziciomin] > iEgeszSzam[i]) {
                i = 0;
                Tombpoziciomin++;
            }
        }
        return Tombpoziciomin;
    }

    private static int getTombpoziciomax(int[] iEgeszSzam, int Tombpoziciomax) {
        for (int i = 0; i < iEgeszSzam.length; i++) {
            if (iEgeszSzam[Tombpoziciomax] < iEgeszSzam[i]) {
                i = 0;
                Tombpoziciomax++;
            }
        }
        return Tombpoziciomax;
    }

    private static void TizelemuTombVeletlenEgeszSzamokkalFeltoltes(int[] iEgeszSzam, Random Veletlen) {
        for (int i = 0; i < 10; i++) {
            iEgeszSzam[i] = Veletlen.nextInt(2, 1500);
            System.out.println(iEgeszSzam[i] + ",");
        }
    }
}