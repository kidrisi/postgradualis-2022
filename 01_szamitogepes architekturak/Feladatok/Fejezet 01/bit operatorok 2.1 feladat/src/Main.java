
// Írj egy programot, ami beolvas egy egész számot, binárisan összeéseli 512-vel, majd az eredményt kíjra.
//Ennek a programnak a segítségével adj meg 3-3 olyan különböző számot ami:
//a. Kisebb mint 512 és a program kimenete 0.
//b. Nagyobb mint 512 és a program kimenete 512.
//c. Nagyobb mint 512 és a program kimenete 0.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Adj meg egy egesz szamot :");
        int iEgesz = sc.nextInt();
        int iEgeszEseles = iEgesz & 512;
        System.out.println(" A szam binaris osszeeselese 512 - vel a kovetkezo eredmenyt adja : " + iEgeszEseles);
        System.out.println(" Az  a) feltetel teljesul  pl : " + " 0 ," + " 511 ," + " 2 " + " eseteben ");
        System.out.println(" A   b) feltetel teljesul  pl : " + " 1023  , " + " 513 ," + " 257 " + " eseteben");
        System.out.println(" A   c) feltetel teljesul  pl : " + " 1024  , " + " 32768 ," + " 1073741824 " + " eseteben");
    }
}