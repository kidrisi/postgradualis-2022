//1. Olvass be egy karakterláncot, majd írd ki
//a. a hosszát
//b. nagybetűsített alakájt (keress beépített függvényt erre)
//c. kisbetüsített alakját(keress beépített függvényt erre


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Adjon meg egy karakterlancot !");
        String sKarakterLanc = sc.next();
        int iKarakterLancHossza = sKarakterLanc.length();
        System.out.println(" A karakterlanc hossza : " + " " + iKarakterLancHossza);
        String sKarakterNagybetusitve = sKarakterLanc.toUpperCase();
        //System.out.println(" A karakterlanc nagybetusitett alakja : " + " "+ sKarakterNagybetusitve);
        String sKarakterlancKisbetusitve = sKarakterLanc.toLowerCase();
        //System.out.println(" A karakterlanc kisbetusitett alakja : " + " "+ sKarakterlancKisbetusitve);
        if (sKarakterLanc == sKarakterNagybetusitve) {
            System.out.println(" A karakterlanc kisbetusitett alakja : " + " " + sKarakterlancKisbetusitve);
        }
        if (sKarakterLanc == sKarakterlancKisbetusitve) {
            System.out.println(" A karakterlanc nagybetusitett alakja : " + " " + sKarakterNagybetusitve);
        }
    }
}