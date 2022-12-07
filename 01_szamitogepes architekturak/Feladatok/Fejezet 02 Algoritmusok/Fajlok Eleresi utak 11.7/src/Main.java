//Írjon egy programot, ami a parancssori argumentumaként kapott
// fájlból feltölt egy kétdimenziós törtszám tömböt, aminek a
// második dimenziói változnak. A fájl első sora azt adja meg,
// hogy a tömb első dimenziója mentén hány elem van.
// Ez után minden sor egy számmal kezdődik, ami azt mutatja meg,
// hogy a második dimenzióban
// a tömb hány elemet tartalmaz abban az elemben.
// Majd ezek a számok következnek szóközökkel elválasztva.


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader(Paths.get(args[0]).toFile());
        Scanner Filescanner = new Scanner(fr);
        double[][] Tomb = new double[(int) Filescanner.nextDouble()][];
        Filescanner.nextLine();
        for (int i = 0; i < Tomb.length; i++) {
            Tomb[i] = new double[(int) Filescanner.nextDouble()];
            for (int j = 0; j < Tomb[i].length; j++) {
                Tomb[i][j] = Filescanner.nextDouble();

            }
            Filescanner.nextLine();


        }


    }
}