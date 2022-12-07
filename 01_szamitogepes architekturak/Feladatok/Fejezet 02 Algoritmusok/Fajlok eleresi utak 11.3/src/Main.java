//Írjunk egy programot ami az aktuális könyvtárban létrehoz egy _DataFiles könyvtárat,
// majd a consoleról *-ig beolvasott nevű fájlokat hoz létre ebben a könyvtárban.
//(Próbáld ki, hogy mi történik, ha olyan fájlneveket adsz meg, amik nem kanonikus utak.
// Mit gondolsz, miért lehet ebből baj?)


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Path AktualisKonyvar = Paths.get(".", "\\_DataFiles");
        Path AktualisUtvonalAbszolut = AktualisKonyvar.toAbsolutePath().normalize();
        File _DataFilesKonyvtar = AktualisUtvonalAbszolut.toFile();
        boolean KeszAKonyvtar = _DataFilesKonyvtar.mkdir();
        Scanner sc = new Scanner(System.in);
        String FileNev;
        do {
            System.out.println("Adja meg a letrehozando file nevet !");
            FileNev = sc.nextLine();
            AktualisKonyvar = Paths.get(".", "\\_DataFiles", FileNev);
            AktualisUtvonalAbszolut = AktualisKonyvar.toAbsolutePath().normalize();
            File Ujfajl = AktualisUtvonalAbszolut.toFile();
            boolean KeszAFile = Ujfajl.createNewFile();
        } while (!FileNev.equals("*"));


    }
}
// nem tudom mi a gond a csillaggal, ha azt adok be akkor hibauzenet jon ki
