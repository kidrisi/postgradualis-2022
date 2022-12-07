//Írj egy programot ami addig kér be könyvtárneveket, ameddig abban
// pont nem lesz (pl x, y, a.txt), majd ez alapján létrehozza
// az aktuális könyvtárban az x/y/a.txt fájlt.


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    private static String EleresiUtvonal = "D:\\Github\\postgradualis-2022\\01_szamitogepes architekturak\\Feladatok\\Fejezet 02 Algoritmusok\\Fajlok eleresi utak 11.4";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String UjKonyvtar;
        boolean FajlLetrehozasa = false;
        boolean Konyvtar = false;
        do {
            System.out.println("Adja meg a letrehozando konyvtar nevet !");
            UjKonyvtar = sc.nextLine();
            for (int i = 0; i < UjKonyvtar.length(); i++) {
                if (UjKonyvtar.charAt(i) != '.') {
                    Konyvtar = true;
                } else {
                    Konyvtar = false;
                    break;
                }
            }
            if (Konyvtar == true) {

                Path EleresiUtvonal = Paths.get(Konyvtarletrehozas(UjKonyvtar));
                Path AbszoluteleresiUtvonal = EleresiUtvonal.toAbsolutePath().normalize();
                File KonyvtarBejegyzes = AbszoluteleresiUtvonal.toFile();
                boolean KonyvtarLetrehozas = KonyvtarBejegyzes.mkdir();

                if (KonyvtarLetrehozas == true) {
                    System.out.println("A konyvtar letrehozasa megtortent");
                } else {
                    System.out.println("A konyvtarat nem sikerult letrehozni");
                }
            } else {
                Path FajlEleresiUtvonal = Paths.get(Konyvtarletrehozas(UjKonyvtar));
                Path FajlAbszolutElereseiUtvonal = FajlEleresiUtvonal.toAbsolutePath().normalize();
                File FileBejegyzes = FajlAbszolutElereseiUtvonal.toFile();
                FajlLetrehozasa = FileBejegyzes.createNewFile();
                if (FajlLetrehozasa == true) {
                    System.out.println("A fajl letrehozasa megtortent");

                } else {
                    System.out.println("Nem sikerult a file  letrehozasa");
                }
            }
        } while (FajlLetrehozasa == false);
    }

    private static String Konyvtarletrehozas(String x) {
        EleresiUtvonal = EleresiUtvonal + "\\" + x;
        return EleresiUtvonal;



    }
}
