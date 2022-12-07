//Írjon egy programot, ami a parancssori argumentumaként kapott fájlból
// feltölt egy karakterláncokból álló tömböt.
// A fájl első sorában a feltöltendő tömb hossza van.
// Utána egy üress sor. Majd a tömb elemei soronként.


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(Paths.get(args[0]).toFile());
        Scanner scOlvasas = new Scanner(fr);
        String[] Tomb = new String[scOlvasas.nextInt()];
        scOlvasas.nextLine();
        scOlvasas.nextLine();
        for (int i = 0; i < Tomb.length; i++) {
            Tomb[i] = scOlvasas.nextLine();

        }
        fr.close();


    }

}