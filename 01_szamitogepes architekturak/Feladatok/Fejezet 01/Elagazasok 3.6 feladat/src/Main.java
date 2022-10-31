//Kérjen be egy karaktert és írja ki a nagybetűsített változatát
// (ne használj beépített függvényeket, hanem a karakterek kódja alapján programozz).


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Irjon be egy karaktert !");
        String sKarakter = sc.next();
        //System.out.println("" + cKarakter);
        char cKarakter = sKarakter.charAt(0);
        //System.out.println(cKarakter);
        int iKarakterErteke = cKarakter * 1;
        //System.out.println(iKarakterErteke);
        int iBetuNagybet = iKarakterErteke + (32);
        char cKisbetu = (char) (iBetuNagybet);
        //System.out.println(" A kis betus valtozata : " + cKisbetu);
        int iBetuKisbetu = iKarakterErteke + -32;
        char cNagybetu = (char) (iBetuKisbetu);
        //System.out.println(" A nagy betus valtozata : "+ cNagybetu);
        if (iKarakterErteke >= 97 && (iKarakterErteke <= 122)) {
            System.out.println(" A nagy betus valtozata : " + cNagybetu);
        } else {
            System.out.println(" A kis betus valtozata : " + cKisbetu);
        }


    }

}




