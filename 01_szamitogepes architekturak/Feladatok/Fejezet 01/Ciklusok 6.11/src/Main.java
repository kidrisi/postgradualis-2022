//Írj egy programot, amely egy karakterláncot kér be. Majd minden olyan betüről,
// ami legalább kétszer szerepel, kiírja, hogy az hányszor szerepelt.
// Pl: „thequickbrownfoxjumpsoverthelazydog” esetén o 4, e 3, u 2, h 2, r 2, t 2.
// Bónuszpontért lehet előfordulási gyakoriság szerint csökkenő sorrendben kiírni.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
      //  System.out.println("Adja meg a szoveget");
        String Sszo = "thequickbrownfoxjumpsoverthelazydog";
        int iSzohossz = Sszo.length();
        int iKarakterekSzama = 0;
        int a = 0;
        int b = 0;
        char[] sKaraktertomb = new char[iSzohossz];
        for (int i = 0; i < iSzohossz; i++) {
            sKaraktertomb[i] = Sszo.charAt(i);
        }
        for (int i = 0; i < iSzohossz; i++) {
            for (int j = 0; j < iSzohossz; j++) {
                if (sKaraktertomb[iKarakterekSzama] == sKaraktertomb[j]) {
                    a++;
                }
            }
            if (a >= 2 && sKaraktertomb[iKarakterekSzama] != (' ')) {
                     // b++;
                System.out.println(sKaraktertomb[iKarakterekSzama] + " " + a);
                for (int h = 0; h < iSzohossz; h++) {
                    if (Sszo.charAt(iKarakterekSzama) == Sszo.charAt(h)) {
                        sKaraktertomb[h] = ' ';
                    }
                }
            }
            iKarakterekSzama++;
            a = 0;
        }   //String[] sBetugyakorisag  = new String[b];   //System.out.println(b);

    }
}