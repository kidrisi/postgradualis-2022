import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Adjon meg egy szot: ");
        String sMegadottSzo = sc.next();
        int iMegszamlaltSzo = sMegadottSzo.length();
       // System.out.println("Karakterek szama : " + iMegszamlaltSzo);
        char cElsoBetu = sMegadottSzo.charAt(0);
        for (int i = 0; i < iMegszamlaltSzo; i++) {
            System.out.println( cElsoBetu);

        }

    }
}