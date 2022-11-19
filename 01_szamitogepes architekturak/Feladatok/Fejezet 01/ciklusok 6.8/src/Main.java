//Írj egy programot ami karakterláncokat kér be addig amígy *-ot
// nem kap, majd kiírja a leghoszabb megadott karakterlánc hosszát.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Adja meg a szot!");
        String sSzo = sc.nextLine();
        int a = 0;
        int b = 0;
        for (int i = 0; i < 1; i++) {
            while (!sSzo.equals("e")) {
                System.out.println(" Adja meg a szot!");
                sSzo = sc.nextLine();
                b = sSzo.length();
                while (!sSzo.equals("e")) {
                    System.out.println(" Adja meg a szot!");
                    sSzo = sc.nextLine();
                    a = sSzo.length();
                }

                // while (!sSzo.equals("e")) {

                //  System.out.println(" Adja meg a szot!");
                //  sSzo = sc.nextLine();
                //  b = sSzo.length();
                //   System.out.println(" Adja meg a szot!");
                //  sSzo = sc.nextLine();
                //   a = sSzo.length();
                {
                    //  if (a > b) {
                    //  System.out.println(a);
                    //  } else {
                    //     System.out.println(b);
                    //  }
                    //      if (sSzo == ("e")) {


                    {
                    }
                }
            }
        }
    }
}