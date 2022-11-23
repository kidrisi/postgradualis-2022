//Írj egy programot amely felölt egy 10 elemű egész szám tömböt
// 2 és 15000 közötti véletlen egész számokkal,
// kiírja a tömb elemeit sorrendben vesszővel elválasztva,
// megcseréli a legkisebb és a legnagyobb element, majd újra kiírja a tömb elemeit.
//Mivel a számok hossza eltérő, ezért a kiírás láthatóan igénytelennek hat.
// Gondoskodj róla, hogy a két kiírás egymás alatti sorokban legyen, és a
// számokat elválasztó vesszők egymás fölé legyenek igazítva.
// (Használd fel az előző feladat kódját.)


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
        for (int i = 0; i < 10; i++) {
            iEgeszSzam[i] = Veletlen.nextInt(2, 1500);
            System.out.println(iEgeszSzam[i] + ",");
        }
        for (int i = 0; i < iEgeszSzam.length; i++) {
            if (iEgeszSzam[Tombpoziciomax] < iEgeszSzam[i]) {
                i = 0;
                Tombpoziciomax++;
            }
        }
        for (int i = 0; i < iEgeszSzam.length; i++) {
            if (iEgeszSzam[Tombpoziciomin] > iEgeszSzam[i]) {
                i = 0;
                Tombpoziciomin++;
            }
        }
        int[] MaximumErtek = new int[1];
        MaximumErtek[0] = iEgeszSzam[Tombpoziciomax];
        Eltaroltmaxertek[0] = iEgeszSzam[Tombpoziciomax];
        iEgeszSzam[Tombpoziciomax] = iEgeszSzam[Tombpoziciomin];
        iEgeszSzam[Tombpoziciomin] = Eltaroltmaxertek[0];
        System.out.println("_______________________");
        System.out.println("Veletlen szamok sorrendje a min es a max ertek helyeinek felcserelese utan:");
        System.out.println("_______________________");
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

}