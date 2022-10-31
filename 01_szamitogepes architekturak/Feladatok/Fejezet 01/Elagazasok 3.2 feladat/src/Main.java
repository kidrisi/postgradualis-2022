//Kérj be két számot, majd kérd be,
// hogy számtani vagy mértani középarányost szeretnénk számolni.
// Számold és írd ki a kért művelet eredméyét.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem az elso szamot : ");
        double iElsoSzam = sc.nextDouble();
        System.out.println(" Kerem a masodik szamot : ");
        double iMasodikSzam = sc.nextDouble();
        System.out.println(" Ha a szamtani kozeparanyost szamoljuk ki adja meg az 1-es szamot, ha a mertanit adja meg nyomja meg barmelyik 1 nagyobb szamot ! ");
        int iKozeparanyosKodja = sc.nextInt();
        if (iKozeparanyosKodja == 1) {
            double iSzamtaniKozeparanyos = (iElsoSzam + iMasodikSzam) / 2;
            System.out.println(" A megadott szamok szamtani kozeparanyosa = :" + " " + iSzamtaniKozeparanyos);
        }else{
            System.out.println("A megadott szamok mertani kozeparanyosa = : " + " "+ Math.sqrt(iElsoSzam * iMasodikSzam) );
        }


    }
}