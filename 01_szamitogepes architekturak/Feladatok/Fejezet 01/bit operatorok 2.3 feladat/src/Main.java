// Írj egy programot, ami beolvas egy egész számot, binárisan összekizáróvagyolja (XOR-olja) 512-vel, majd az eredményt kíjra.
//Ennek a programnak a segítségével adj meg olyan számokat ami:
//a. Kisebb mint 512 és a program kimenete 578.
//b. Nagyobb mint 512 és a program kimenete 1030.
//c. Nagyobb mint 512 és a program kimenete 1534.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Adj meg egy egesz szamot : ");
        int i1 = sc.nextInt();
        int i1OsszeKizaroVagyolas = 512 ^ i1;
        System.out.println(" Az adott ertek 512 - vel valo binaris XOR -ja :  " + i1OsszeKizaroVagyolas);
        if (i1OsszeKizaroVagyolas == 578) {
            System.out.println(" Az a) feltetel teljesul ha x = 66 ");
        }
        if (i1OsszeKizaroVagyolas == 1030) {
            System.out.println(" A b) feltetel teljesul ha x = 1542 ");
        }
        if (i1OsszeKizaroVagyolas == 1534) {
            System.out.println(" A c) feltetel teljesul ha x = 2046 ");
        } else if (i1OsszeKizaroVagyolas != 578 && i1OsszeKizaroVagyolas != 1030 && i1OsszeKizaroVagyolas != 1534) {
            System.out.println(" Egyik feltetel sem teljesul ");
        }

    }

}


//i1OsszeKizaroVagyolas != 1534) ezt a kiemelest nem ertem , miert mondja azt hogy mindig igaz, nem jo a sorrend , mashova kell tenni a feltetelt, vagy maskepp kell biztosan leirni?







