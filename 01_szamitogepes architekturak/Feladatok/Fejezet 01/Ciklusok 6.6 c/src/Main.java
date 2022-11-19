import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sElszoKarakterlanc = "abrabrabra";
        String sMasodikKarakterlanc = "abra";
        int iElsoLancHossza = sElszoKarakterlanc.length();
        int iMasodikLAncHossza = sMasodikKarakterlanc.length();
        int a = 0;
        int b = 0;
        for (int j = 0; j < iMasodikLAncHossza; j++) {
            String uj = sElszoKarakterlanc.substring(j, j + iMasodikLAncHossza);

            if (uj.equals(sMasodikKarakterlanc)) {
                a++;
            }
            {

            }
        }
        for (int j = 0; j < iElsoLancHossza; j++) {
            String ujc = sElszoKarakterlanc.substring(j+(iMasodikLAncHossza-iMasodikLAncHossza), j + (iMasodikLAncHossza));
            //String uj2 = sElszoKarakterlanc.substring((iMasodikLAncHossza-1)+j,j+iMasodikLAncHossza+(iMasodikLAncHossza-1));
            //System.out.println(uj2);


            if (ujc.equals(sMasodikKarakterlanc)) {

                b++;
            }

        }
    }

}














