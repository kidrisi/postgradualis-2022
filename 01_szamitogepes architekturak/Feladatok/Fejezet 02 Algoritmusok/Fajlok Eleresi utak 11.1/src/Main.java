//Írja ki a program aktuális könyvtárában lévő összes könyvtár és fájl nevét.
// Egyszer a könyvtrárakat, utána a fájlokat.


import javax.xml.xpath.XPath;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Path aktualisKonyvtar = Paths.get(".");
        Path aktualisKonyvtarAbsolutr = aktualisKonyvtar.toAbsolutePath().normalize();
        File aktualiskinyvtarInfo = aktualisKonyvtarAbsolutr.toFile();
        File[] Bejegzesek = aktualiskinyvtarInfo.listFiles();
        System.out.println("Konyvtar");
        for (int i = 0; i < Bejegzesek.length; i++) {
            if (Bejegzesek[i].isDirectory()) {
                System.out.println(Bejegzesek[i]);
            }


        }
        System.out.println("File");
        for (int i = 0; i < Bejegzesek.length; i++) {
            if (Bejegzesek[i].isFile()) {
                System.out.println(Bejegzesek[i]);
            }

        }


    }
}