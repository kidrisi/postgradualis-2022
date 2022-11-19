import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Hany keresztnevet szeretne megadni ? 1 es 5 kozott");
        int KeresztnevekSzama = sc.nextInt();
        sc.nextLine();
        String[] Keresztnev = new String[KeresztnevekSzama];
        for (int i = 0; i < KeresztnevekSzama ; i++) {
            System.out.println(" Adja meg : " + ( i+1 )  + ". nevet " );
            Keresztnev[i] = sc.nextLine();
        }
        for (int i = 0; i < KeresztnevekSzama ; i++) {
            System.out.println( Keresztnev [(KeresztnevekSzama -1)-i]) ;

        }


    }
}