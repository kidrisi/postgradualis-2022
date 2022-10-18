// 1. Olvass be két egész számot és írd ki a
//a. összegüket
//b. különbségüket
//c. szorzatukat
//d. maradékos osztási hányadosukat
//e. osztási maradékukat

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Adj meg egy szamot : ");
        double d1 = sc.nextDouble();
        System.out.println(" Add meg a kovetkezo szamot : ");
        double d2 = sc.nextDouble();
        double dOsszeg = d1 + d2;
        double dKulonbseg = d1 - d2;
        double dSzorzat = d1 * d2;
        double dOsztas = d1 / d2;
        double dOsztasiMaradek = d1 % d2;
        System.out.println(" A ket szam osszege : " + dOsszeg);
        System.out.println(" A ket szam kulonbsege : " + dKulonbseg);
        System.out.println(" A ket szam szorzata : " + dSzorzat);
        System.out.println(" A ket szam hanyadosa : " + dOsztas);
        System.out.println(" A ket szam osztasi maradeka : " + dOsztasiMaradek);


    }
}