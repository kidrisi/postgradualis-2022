import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int Szohossz3 = 0;
        int Szohossz2 =0;
        int Szohossz1 = 0;
        int b = 2;
        int j = 0;
        String Szo;
        do {
            System.out.println(" szo ");
            Szo = sc.nextLine();
            Szohossz1 = Szo.length();
            for (int i = 0; i < 1; i++) {
                int[] Szam = new int[2];
                Szam[i] = Szohossz1;
                System.out.println(Arrays.toString(Szam));
                Szohossz2 = Szo.length();
                for ( j = 1; j <= 1; j++){
                  Szam[j]  = Szohossz3;
                Szohossz3= Szo.length();
                    System.out.println(Arrays.toString(Szam));
                }
            }
            b++;
        }while (!Szo.equals ("*"));
        System.out.println("");
    }
}


//  {
//
//
//

//