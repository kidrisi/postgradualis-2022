import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

enum KarakterLancAllapot {

    idezojelenKivul, idezojelenbelul
}

enum KarakterEsemeny {
    idezojel, szunet, betu

}

/////Egy karakterláncon karakterenként végig haladva (mintha egy karakterfolyam lenne,
//// és nem állna rendelkezésre az egész) dolgozza azt fel. A feldolgozás eredménye
//// legyen egy karakterlánc tömb, amibe a bemeneti karakterlánc a parancssori argumentumok
//// darabolási szabályai szerint van felvágva (szóközök mentén darabolva, de ”-ek közötti részeket egyben tartva).
////Pl.: Alma elment aludni mert “nagyon fáradt” volt -> {“Alma”, “elment”, “aludni”, “mert”, “nagyon fáradt”, “volt”}.
public class Main {
    public static void main(String[] args) throws IOException {
        String[] KarakterLancTomb = new String[1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerem adja meg a karakterlancot");
        String Karakterlanc = sc.nextLine();
        int KarakterLAncHossz = Karakterlanc.length();
        Path UjFajlUtja = Paths.get("Karakterlanc.txt");
        File UjFajl = UjFajlUtja.toFile();
        UjFajl.createNewFile();
        FileWriter Filiro = new FileWriter(UjFajl);
        FileReader fileolvaso = new FileReader(UjFajl);
        Scanner Filscanner = new Scanner(fileolvaso);
        KarakterLancAllapot Karakter;
        Filiro.write('"');

        for (int i = 0; i < Karakterlanc.length(); i++) {
            Karakter = KarakterLancAllapot.idezojelenKivul;
            char KovetkezoKarakter = Karakterlanc.charAt(i);

            if (KovetkezoKarakter >= 65 && KovetkezoKarakter <= 90 || KovetkezoKarakter >= 97 && KovetkezoKarakter <= 122) {
                Karakter = KarakterLancKovetkezoAllapota(Karakter, KarakterEsemeny.betu);
                Filiro.write(Karakterlanc.charAt(i));
                Filiro.flush();

            } else if (KovetkezoKarakter == 32) {
                Filiro.write(Karakterlanc.charAt(i));
                Karakter = KarakterLancKovetkezoAllapota(Karakter, KarakterEsemeny.szunet);
                Filiro.write('"' + "" + Karakterlanc.charAt(i) + "" + '"');
                Filiro.flush();
            } else if (KovetkezoKarakter == 34) {

                i++;
                do {
                    KovetkezoKarakter = Karakterlanc.charAt(i);
                    Karakter = KarakterLancAllapot.idezojelenbelul;
                    Karakter = KarakterLancKovetkezoAllapota(Karakter, KarakterEsemeny.betu);
                    if (Karakterlanc.charAt(i) != 34) {
                        Filiro.write(Karakterlanc.charAt(i));
                        Filiro.flush();
                        i++;
                    }


                } while (KovetkezoKarakter != 34);


            }

        }
        if (Karakterlanc.charAt(Karakterlanc.length() - 1) != 34) {
            Filiro.write('"');
        } else {
            Filiro.write(Karakterlanc.charAt(Karakterlanc.length() - 1));
        }

        Filiro.close();
        KarakterLancTomb[0] = Filscanner.nextLine();
        Filscanner.close();
    }

    private static KarakterLancAllapot KarakterLancKovetkezoAllapota(KarakterLancAllapot aktualisAllapot, KarakterEsemeny aktualiskarakteresemeny) {
        switch (aktualisAllapot) {
            case idezojelenKivul:
                switch (aktualiskarakteresemeny) {
                    case betu:
                        return KarakterLancAllapot.idezojelenKivul;
                    case szunet:
                        return KarakterLancAllapot.idezojelenKivul;
                    case idezojel:
                        return KarakterLancAllapot.idezojelenbelul;
                    default:
                        throw new IllegalArgumentException();

                }
            case idezojelenbelul:
                switch (aktualiskarakteresemeny) {
                    case betu:
                        return KarakterLancAllapot.idezojelenbelul;
                    case idezojel:
                        return KarakterLancAllapot.idezojelenKivul;
                    case szunet:
                        return KarakterLancAllapot.idezojelenbelul;

                    default:
                        throw new IllegalArgumentException();

                }
            default:
                throw new IllegalArgumentException();


        }
    }


}
