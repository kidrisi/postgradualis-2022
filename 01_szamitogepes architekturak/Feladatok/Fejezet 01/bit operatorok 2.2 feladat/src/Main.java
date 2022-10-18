//Írj egy programot, ami beolvas egy egész számot, binárisan összevagyolja 512-vel, majd az eredményt kíjra.
//Ennek a programnak a segítségével adj meg 1-1 olyan különböző számot ami:
//a. Kisebb mint 512 és a program kimenete 548.
//b. Nagyobb mint 512 és a program kimenete 1536.
//(próbáljuk okosan kitalálni, hogy mivel érdemes próbálkozni)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Adj meg egy egesz szamot : ");
        int i1 = sc.nextInt();
        int i1EgeszVagyolas = i1 | 512;
        System.out.println(" Az 512 - vel valo ,  bininaris vagyolas eredmenye :" + i1EgeszVagyolas);
        System.out.println(" Az  a) feltetel teljesul  : " + " 36  " + " eseteben ");
        System.out.println(" Az  b) feltetel teljesul  pl az  : " + " 1024  " + " eseteben ");


    }
}