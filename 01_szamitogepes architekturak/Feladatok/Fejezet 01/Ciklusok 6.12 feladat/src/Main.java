//Írj egy programot amely feltölt egy 10
// elemű tömböt véletlen tört számokkal,
// kiírja a tömb elemeit, megcseréli a legnagyobb és a
// legkisebb számot, majd újra kiírja a tömböt.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] dTortek = new double[10];
        Random Veletlen = new Random();
        int Tombpoziciomin = 0;
        int Tombpoziciomax = 0;
        double[] Eltaroltmaxertek = new double[1];
        System.out.println("_______________________");
        System.out.println("Veletlen szamok eredeti sorrendben:");
        System.out.println("_______________________");
        for (int i = 0; i < 10; i++) {
            dTortek[i] = Veletlen.nextDouble();
            System.out.println(dTortek[i]);
        }
        for (int i = 0; i < dTortek.length; i++) {
            if (dTortek[Tombpoziciomax] < dTortek[i]) {
                i = 0;
                Tombpoziciomax++;
            }
        }
        for (int i = 0; i < dTortek.length; i++) {
            if (dTortek[Tombpoziciomin] > dTortek[i]) {
                i = 0;
                Tombpoziciomin++;
            }
        }
        Eltaroltmaxertek[0] = dTortek[Tombpoziciomax];
        dTortek[Tombpoziciomax] = dTortek[Tombpoziciomin];
        dTortek[Tombpoziciomin] = Eltaroltmaxertek[0];
        System.out.println("_______________________");
        System.out.println("Veletlen szamok sorrendje a min es a max ertek helyeinek felcserelese utan:");
        System.out.println("_______________________");
        for (int i = 0; i < dTortek.length; i++) {
            System.out.println(dTortek[i]);

        }
    }
}