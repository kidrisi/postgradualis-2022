import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println(" Kerek egy szamot 5 es 10 kozott !");
        int iszam = nc.nextInt();
        Random e = new Random();
        int iSzamok = '9' - '0' + 1;
        int iKisbetuk = 'z' - 'a' + 1;
        int iNagybetuk = 'Z' - 'A' + 1;
        int iOsszesKarakter = iKisbetuk + iNagybetuk + iSzamok;
        switch (iszam) {
            case 5:

                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                break;

            case 6:

                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                break;

            case 7:

                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                break;

            case 8:
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                break;

            case 9:

                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);

                break;

            case 10:

                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                extracted(e, iSzamok, iNagybetuk, iOsszesKarakter);
                break;
        }
        System.out.println(" ");
    }


    private static void extracted(Random e, int iSzamok, int iNagybetuk, int iOsszesKarakter) {
        int iVeletlenKarakter = e.nextInt(iOsszesKarakter);
        if (iVeletlenKarakter < iSzamok)
            System.out.print(iVeletlenKarakter);
        else if (iVeletlenKarakter > iSzamok && iVeletlenKarakter <= (iSzamok + iNagybetuk))
            System.out.print((char) (64 + (iVeletlenKarakter - iSzamok)));
        else if (iVeletlenKarakter > iSzamok + iNagybetuk)
            System.out.print((char) (96 + (iVeletlenKarakter - (iSzamok + iNagybetuk))));
    }
}
