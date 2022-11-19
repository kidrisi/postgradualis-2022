import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sSzo;
        int a = 0;
        int c = 0;
        int b =1;
        int d = 0;
        int []Szamsor = new int[2];
        do {
            System.out.println(" Adja meg a szot!");
            sSzo = sc.nextLine();
             a = sSzo.length();
             Szamsor[0]= a;
                     Szamsor[1]= c;
            c = sSzo.length();
            int [ ]UjSzamsor = new int[b];
            UjSzamsor[d]= a;
            d++;
            b++;
        }while (!sSzo.equals("e"));
        System.out.println(Szamsor);


    }
}