import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0 ;
        int b = 0 ;
        int c = 0;
        String sSzo;
        do {
            System.out.println(" Adja meg a szot!");
            sSzo = sc.nextLine();
            a = sSzo.length();
            c++;
            b++;
           // int [] iszam = new int[c];
           // iszam [b]= a;
            System.out.println(a);
            {
                //int szamok [] = new int[]{a};
                //int szamok []={a};
               // System.out.println(Arrays.toString(szamok));
            }




        } while (!sSzo.equals("e"));
       int iSzam[]= new int[c];

      //  }



        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
            b = sSzo.length();
        }
    }
}