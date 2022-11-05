
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] AutokSorszama = new String[4][3];
        for (int i = 0; i < 4; i++) {
            System.out.println(" Adja meg a " + (i + 1) + " auto markajat : ");
            AutokSorszama[i][0] = sc.nextLine();
            System.out.println("  Adja meg a " + (i + 1) + " auto szine : ");
            AutokSorszama[i][1] = sc.nextLine();
            System.out.println("  Adja meg a " + (i + 1) + " auto rendszamat : ");
            AutokSorszama[i][2] = sc.nextLine();
        }
        int[] RendszamtablaErtek = new int[4];
        sc.nextLine();

        for (int i = 0; i < 4; i++) {
            char Ertek = AutokSorszama[i][2].charAt(0);
            System.out.println(" Az  " + (i + 1) + " auto rendszamtabla erteke : " + Ertek);
            RendszamtablaErtek[i] = Ertek;


        }


    }


}





// int osszehasonlitas1 =AutokSorszama[0][2].compareTo(AutokSorszama[1][2]);
// int osszehasonlitas2 =AutokSorszama[0][2].compareTo(AutokSorszama[2][2]);
// int osszehasonlitas3 =AutokSorszama[0][2].compareTo(AutokSorszama[3][2]);


// for (int i = 0; i < 3; i++) {
//     int Osszehas = AutokSorszama[0][2].compareTo(AutokSorszama[i + 1][2]);
//      if (Osszehas > 0) {
//         AutokSorszama[i][0] = AutokSorszama[i + 1][0];

//  for (int i = 1; i < 3; i++) {
//       int Osszehas2 = AutokSorszama[1][2].compareTo(AutokSorszama[i + 1][2]);
//      System.out.println(AutokSorszama[1][2].compareTo(AutokSorszama[i + 1][2]));
//  }System.out.println("ab");

// int Osszehas3 = AutokSorszama[2][2].compareTo(AutokSorszama[3][2]);
//  System.out.println(AutokSorszama[2][2].compareTo(AutokSorszama[3][2]));


// int Osszeha = AutokSorszama[0][2].compareTo(((AutokSorszama[1][2])+(AutokSorszama[2][2])+AutokSorszama[3][2]));
// System.out.println(AutokSorszama[0][2].compareTo(((AutokSorszama[1][2])+" "+ (AutokSorszama[2][2])+AutokSorszama[3][2])));
//Arrays.sort(RendszamtablaErtek);
//System.out.println(Arrays.toString(RendszamtablaErtek));





