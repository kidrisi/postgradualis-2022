import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String kiegeszitettAlma = KiegeszitesAdathosszra("alma",
                10, '_',"eleje");




    }

    private static String KiegeszitesAdathosszra(String KiegeszitendoSzoveg,
                                                 int KivantHossz,
                                                 char KiegeszitoKarakter,
                                                 String KiegeszitesHelye) {
        Scanner sc =new Scanner(System.in);
        System.out.println( " Adja meg a szoveget :");
        String sSzoveg = sc.next();
        System.out.println( " Adja meg milyen hosszura szeretne kiegesziteni a szoveget : ");
        int iKiegeszitesHossza = sc.nextInt();
        System.out.println( "Hova szeretne tenni a szunet karaktert: a szoveg ele: 1 vagy a szoveg utan : 2  ? ");
        int sSzovegHelye = sc.nextInt();
        if sSzovegHelye = 1; {
        //if sSzovegHelye =
       // System.out.println( iKiegeszitesHossza);
        int sSzovegHossz = sSzoveg.length();
        //System.out.println( sSzovegHossz);




        return "";
    }
}