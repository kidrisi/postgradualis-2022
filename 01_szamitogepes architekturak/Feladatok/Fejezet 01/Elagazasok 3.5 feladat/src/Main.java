//Kérjen be egy karaktert és döntse el,
// hogy az kisbetű, nagybetű vagy szám
// (ne használj beépített függvényeket,
// hanem a karakterek kódja alapján programozz).


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
        if (iKarakterErteke >= 48 && (iKarakterErteke <= 57)) {
            System.out.println(" A megadott karakter:  egy szam");
        } else if (iKarakterErteke >= 97 && (iKarakterErteke <= 122)) {
            System.out.println(" A megadott karakter:  egy kisbetu ");
        } else if (iKarakterErteke >= 65 && (iKarakterErteke <= 90)) {
            System.out.println(" A megadott karakter:  egy nagybetu ");

        }


    }
}