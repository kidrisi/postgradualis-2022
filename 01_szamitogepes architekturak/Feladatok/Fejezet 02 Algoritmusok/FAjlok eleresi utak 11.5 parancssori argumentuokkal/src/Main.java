//Írjon egy programot, ami a parancssori argumentumaként kapott fájlból
// feltölt egy egész számokból álló tömböt.
// A fájl első sorában a feltöltendő tömb hossza van.
// Utána egy üress sor. Majd a tömb elemei szóközzel elválasztva.


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(Paths.get(args[0]).toFile());
        Scanner scFileolvaso = new Scanner(fr);
        int[] Tomb = new int[scFileolvaso.nextInt()];
        scFileolvaso.nextLine();
        for (int i = 0; i < Tomb.length; i++) {
            Tomb[i] = scFileolvaso.nextInt();
        }

        fr.close();


    }
}