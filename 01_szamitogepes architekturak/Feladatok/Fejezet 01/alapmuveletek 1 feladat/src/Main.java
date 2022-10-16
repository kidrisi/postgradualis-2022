import java.util.Scanner;

public class Main {
    //Olvass be két egész számot és írd ki a
    //a. összegüket
    //b. különbségüket
    //c. szorzatukat
    //d. maradékos osztási hányadosukat
    //e. osztási maradékukat
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg az eslo szamot: ");
        double d1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Add meg a masodik szamot: ");
        double d2 = sc.nextDouble();
        sc.nextLine();
        double dOsszeg = d1 + d2;
        double dKulonbseg = d1 - d2;
        double dSzorzat = d1 * d2;
        double dOsztas = d1 / d2;
        double dOsztasimaradek = d1 % d2;
        System.out.println("Az osszeadas osszege: ");
        System.out.println(d1 + d2);
        System.out.println(dOsszeg);
        System.out.println("A kivonas kulonbsege: ");
        System.out.println(dKulonbseg);
        System.out.println("A szorzat erteke: ");
        System.out.println(dSzorzat);
        System.out.println("Az osztas hanyadosa: ");
        System.out.println(dOsztas);
        System.out.println("Az osztas maradeka: ");
        System.out.println(dOsztasimaradek);
    }
}