import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

//Írjon egy programot ami az aktuális könyvtárban lévő bemenet.txt fájlból felölt
// egy karakterlánc tömböt. A fájl első sorában a későbbi sorok száma van,
// utána soronként egy-egy karakterlánc.
//a. Rendezze a tömböt buborék rendezéssel.
//b. Rendezze a tömböt kiválasztásos rendezéssel.
//c. Rendezze a tömböt beszúrásos rendezéssel.
//A rendezést a karakterláncok első betűje alapján végezze el.
public class Main {
    public static void main(String[] args) throws IOException {
        Path Ujfajl = Paths.get("bemenet.txt");
        File Ujfajletrehozas = Ujfajl.toFile();
        Ujfajletrehozas.createNewFile();
        FileWriter fw = new FileWriter(Ujfajletrehozas);
        fw.write("" + 5);
        fw.write("\r\n");
        fw.write("Kakao");
        fw.write("\r\n");
        fw.write("Macska");
        fw.write("\r\n");
        fw.write("Bela");
        fw.write("\r\n");
        fw.write("Marci");
        fw.write("\r\n");
        fw.write("Almos");
        fw.write("\r\n");
        fw.close();
        FileReader fr = new FileReader(Paths.get("bemenet.txt").toFile());
        Scanner sc = new Scanner(fr);
        String[] Tomb = new String[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < Tomb.length; i++) {
            Tomb[i] = sc.nextLine();


        }//Buborek(Tomb);
        //BubiUppgrade(Tomb);
        // KivalasztasosR(Tomb);
        //Beszurasos(Tomb);


    }

    private static void Buborek(String[] str) {

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - 1; j++) {
                if (str[j].charAt(0) > str[j + 1].charAt(0)) {
                    String Karakter = str[j + 1];
                    str[j + 1] = str[j];
                    str[j] = Karakter;
                }

            }

        }
    }

    private static void BubiUppgrade(String[] str) {
        boolean Voltcsere;
        do {
            Voltcsere = false;
            for (int i = 0; i < str.length - 1; i++) {
                if (str[i].charAt(0) > str[i + 1].charAt(0)) {
                    Voltcsere = true;
                    String Karakter = str[i + 1];
                    str[i + 1] = str[i];
                    str[i] = Karakter;

                }


            }
        } while (Voltcsere);


    }

    private static void KivalasztasosR(String[] str) {
        for (int aktualiselempozicioja = 0;
             aktualiselempozicioja < str.length; aktualiselempozicioja++) {
            int Legkisebbelempozicioja = aktualiselempozicioja;
            for (int i = aktualiselempozicioja + 1; i < str.length; i++) {
                if (str[i].charAt(0) < str[Legkisebbelempozicioja].charAt(0)) {
                    Legkisebbelempozicioja = i;
                }

            }
            if (Legkisebbelempozicioja != aktualiselempozicioja) {
                String Temp = str[Legkisebbelempozicioja];
                str[Legkisebbelempozicioja] = str[aktualiselempozicioja];
                str[aktualiselempozicioja] = Temp;
            }

        }

    }

    private static void Beszurasos(String[] str) {
        for (int elsonemrendezettlen = 0;
             elsonemrendezettlen < str.length; elsonemrendezettlen++) {
            int Csusztatott = elsonemrendezettlen;
            while (Csusztatott > 0 && str[Csusztatott - 1].charAt(0) > str[Csusztatott].charAt(0)) {
                String Temp = str[Csusztatott];
                str[Csusztatott] = str[Csusztatott - 1];
                str[Csusztatott - 1] = Temp;
                Csusztatott--;
            }

        }

    }
}