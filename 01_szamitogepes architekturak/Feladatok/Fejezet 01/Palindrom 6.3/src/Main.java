import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Kerek egy szot : ");
        String  sKarakter = sc.next();
        int iKarakterHossz = sKarakter.length();
        // System.out.println(iKarakterHossz);
        char cElsoKarakter= sKarakter.charAt(0);
        //System.out.print(cElsoKarakter);
        char cMasodikKarakter= sKarakter.charAt(-1);
        System.out.print(cMasodikKarakter);
    }
}