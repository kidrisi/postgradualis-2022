//Írjon egy programot, ami a parancssori argumentumaként kapott fájlból
// feltölt egy egész számokból álló tömböt.
// A fájl első sorában a feltöltendő tömb hossza van.
// Utána egy üress sor. Majd a tömb elemei szóközzel elválasztva.

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Path Ujfajl = Paths.get(" adatfile.txt");
        File FileBejegyzes = Ujfajl.toFile();
        FileBejegyzes.createNewFile();
        FileWriter fw = new FileWriter(FileBejegyzes);
        fw.write("" + 5);
        fw.write("\r\n");
        fw.write("\r\n");
        fw.write("" + 3 + " " + 4 + " " + 2 + " " + 15 + " " + 21);
        fw.close();
        FileReader fr = new FileReader(FileBejegyzes);
        Scanner scFileolvasas = new Scanner(fr);
        int[] Tomb = new int[scFileolvasas.nextInt()];
        scFileolvasas.nextLine();
        for (int i = 0; i < Tomb.length; i++) {
            Tomb[i] = scFileolvasas.nextInt();
        }
        fr.close();


    }
}