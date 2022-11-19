import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sSzo;
        int aHossz = 0;
        int bHossz = 0;
        int Sorszam = -1;
        int Maximum = 0;
        do {
            System.out.println(" Adja meg a szot!");
            sSzo = sc.nextLine();
            bHossz = sSzo.length();
            Sorszam++;
            int[] Szamok = new int[]{bHossz, aHossz};
            int max = Arrays.stream(Szamok)
                    .max()
                    .getAsInt();
            Maximum = max;
            aHossz = sSzo.length();
        } while (!sSzo.equals("e"));
        System.out.println(" A leghosszabb lancod " + Maximum + " karakterbol allt ");
    }
}