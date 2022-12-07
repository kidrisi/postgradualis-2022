//Írja ki a program prancssori argumentumaként megkapott könyvtárban
// lévő összes könyvtár és fájl nevét. Egyszer a könyvtrárakat, utána a fájlokat.


import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path Utvonal = Paths.get(args[3]).toAbsolutePath();
        File Konyvtarinfo = Utvonal.toFile();
        File[] Bejegyzesek = Konyvtarinfo.listFiles();
        System.out.println("Konyvtar :");
        for (int i = 0; i < Bejegyzesek.length; i++) {
            if (Bejegyzesek[i].isDirectory()) {
                System.out.println(Bejegyzesek[i]);
            }

        }
        System.out.println("File : ");
        for (int i = 0; i < Bejegyzesek.length; i++) {
            if (Bejegyzesek[i].isFile()) {
                System.out.println(Bejegyzesek[i]);
            }

        }

    }
}