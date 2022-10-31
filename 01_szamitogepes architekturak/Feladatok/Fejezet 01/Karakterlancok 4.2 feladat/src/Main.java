//Írj programot mely beolvas két karakterláncot.
// Majd megnézi, hogy az egyik benne van-e a másikban
// és ennek megfelelően kírja, hogy az első része a másiknak,
// a második az elsőnek, egyenlőek, vagy egyik sem.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Elso karakterlanc :");
        String sElsoKarakterlanc = sc.nextLine();
        System.out.println(" Masodik karakterlanc :");
        String sMasodikKarakterlanc = sc.nextLine();
        int iElsoKarakterHossz = sElsoKarakterlanc.length();
        int iMasodikKarakterHossz = sMasodikKarakterlanc.length();
        //String sOsszehasonlitas = String.valueOf(sElsoKarakterlanc.contains(sMasodikKarakterlanc));
        //System.out.println(sOsszehasonlitas);
        sElsoKarakterlanc = sElsoKarakterlanc.toLowerCase();
        sMasodikKarakterlanc = sMasodikKarakterlanc.toLowerCase();
        boolean sAzonos = sElsoKarakterlanc.contentEquals(sMasodikKarakterlanc);
        System.out.println(sAzonos);
        boolean sElso = sElsoKarakterlanc.contains(sMasodikKarakterlanc);
        System.out.println(sElso);
        boolean sMasodik = sMasodikKarakterlanc.contains(sElsoKarakterlanc);
        System.out.println(sMasodik);
        //int iElsoben = sElsoKarakterlanc.indexOf(sMasodikKarakterlanc);
       // System.out.println(iElsoben);
        //int iMasodikban = sMasodikKarakterlanc.indexOf(sElsoKarakterlanc);
        //System.out.println(iMasodikban);
        if (sAzonos) {
            System.out.println(" A ket karakter azonos");
        } else if (sElso) {
            System.out.println(" A masodik karakter benne van az elsoben");
        } else if (sMasodik)
            System.out.println(" Az elso karakter benne van a masodik karakterlancban");
        else {
            System.out.println(" Nem vagyok bizto hogy jo e a megoldas");
        }
    }
}

// int iOsszehasonlitas = sElsoKarakterlanc.compareTo(sMasodikKarakterlanc);
// System.out.println(iOsszehasonlitas);
// String a = String.valueOf(sElsoKarakterlanc.equalsIgnoreCase(sMasodikKarakterlanc));
//System.out.println(a);


//int iMasodikKarakterHossz = sMasodikKarakterlanc.length();



