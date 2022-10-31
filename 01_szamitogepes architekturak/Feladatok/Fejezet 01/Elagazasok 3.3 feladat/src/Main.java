import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ha a kor sugarat szeretne megadni irja be : sugar " + "  " + "Ha a kor atmerojet irja be : atmero ");
        String sKorErtek1 = sc.next();
        String sSugar = "sugar";
        String sAtmero = "atmero";
        //System.out.println( sKorErtek1);
        if (sKorErtek1.equals(sSugar)) {
            System.out.println(" Adja meg a kor sugarat: ");
            double dKorSugara = sc.nextDouble();
            System.out.println(" A kor terulete : " + Math.pow(dKorSugara, 2) * 3.14);
        } else if (sKorErtek1.equals(sAtmero)) {
            System.out.println(" Adja meg a kor atmerojet :");
            double dKorAtmeroje = sc.nextDouble();
            System.out.println(" A kor terulete : " + (Math.pow(dKorAtmeroje, 2) * 3.14) / 4);
        }


    }


}
