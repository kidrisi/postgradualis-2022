import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] sKeresztnev = new String[3];
        System.out.println("Kerem adja meg az elso keresztnevet ! ");
        String ElsoKeresztnev = sc.nextLine();
        ;
        System.out.println("Kerem adja meg a masodik keresztnevet ! ");
        String MasodikKeresztnev = sc.nextLine();
        System.out.println("Kerem adja meg a harmadik keresztnevet ! ");
        String HarmadikKeresztnev = sc.nextLine();
        String sElsoNagybetusitett = ElsoKeresztnev.toUpperCase();
        String sMasodikNagybetusitett = MasodikKeresztnev.toUpperCase();
        String sHarmadikNagybetusitett = HarmadikKeresztnev.toUpperCase();
        sKeresztnev[0] = sElsoNagybetusitett;
        sKeresztnev[1] = sMasodikNagybetusitett;
        sKeresztnev[2] = sHarmadikNagybetusitett;
        int iOsszehasonlitas1 = sKeresztnev[0].compareTo(sKeresztnev[1]);
        int iOsszehasonlitas2 = sKeresztnev[1].compareTo(sKeresztnev[0]);
        int iOsszehasonlitas3 = sKeresztnev[1].compareTo(sKeresztnev[2]);
        int iOsszehasonlitas4 = sKeresztnev[2].compareTo(sKeresztnev[0]);
        int iOsszehasonlitas5 = sKeresztnev[2].compareTo(sKeresztnev[1]);
        int iOsszehasonlitas6 = sKeresztnev[0].compareTo(sKeresztnev[2]);
        if (iOsszehasonlitas1 < 0 && iOsszehasonlitas5 > 0) {
            System.out.println(ElsoKeresztnev + " " + MasodikKeresztnev + " " + HarmadikKeresztnev);
        } else if (iOsszehasonlitas6 < 0 && iOsszehasonlitas5 < 0) {
            System.out.println(ElsoKeresztnev + " " + HarmadikKeresztnev + " " + MasodikKeresztnev);

        } else if (iOsszehasonlitas3 < 0 && iOsszehasonlitas4 < 0) {
            System.out.println(MasodikKeresztnev + " " + HarmadikKeresztnev + " " + ElsoKeresztnev);

        } else if (iOsszehasonlitas2 < 0 && iOsszehasonlitas6 < 0) {
            System.out.println(MasodikKeresztnev + " " + ElsoKeresztnev + " " + HarmadikKeresztnev);

        } else if (iOsszehasonlitas4 < 0 && iOsszehasonlitas1 < 0) {
            System.out.println(HarmadikKeresztnev + " " + ElsoKeresztnev + " " + MasodikKeresztnev);

        } else if (iOsszehasonlitas4 < 0 && iOsszehasonlitas2 < 0) {
            System.out.println(HarmadikKeresztnev + " " + MasodikKeresztnev + " " + ElsoKeresztnev);

        } else if (iOsszehasonlitas1 == 0 && iOsszehasonlitas3 < 0) {
            System.out.println(ElsoKeresztnev + " " + MasodikKeresztnev + " " + HarmadikKeresztnev);

        } else if (iOsszehasonlitas6 == 0 && iOsszehasonlitas5 < 0) {
            System.out.println(ElsoKeresztnev + " " + HarmadikKeresztnev + " " + MasodikKeresztnev);
        } else if (iOsszehasonlitas3 == 0 && iOsszehasonlitas4 < 0) {
            System.out.println(MasodikKeresztnev + " " + HarmadikKeresztnev + " " + ElsoKeresztnev);

        } else if (iOsszehasonlitas1 < 0 && iOsszehasonlitas3 == 0) {
            System.out.println(ElsoKeresztnev + " " + MasodikKeresztnev + " " + HarmadikKeresztnev);

        } else if (iOsszehasonlitas1 > 0 && iOsszehasonlitas3 < 0) {
            System.out.println(MasodikKeresztnev + " " + ElsoKeresztnev + " " + HarmadikKeresztnev);
        } else {
            System.out.println(MasodikKeresztnev + " " + ElsoKeresztnev + " " + HarmadikKeresztnev);
        }


    }


}
