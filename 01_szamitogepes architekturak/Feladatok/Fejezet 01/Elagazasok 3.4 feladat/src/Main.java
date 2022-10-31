//Kérjen be egy számot 1 és 7 közöt és írja ki,
// hogy az a szám a hét melyik napjának felel meg (hétfő, kedd, ...).
// Ha nem megfelelő számot adott meg a felhasználó, írd ki, hogy ejnye bejnye.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Adjon meg egy 1 es 7 kozotti szamot !");
        int iBeadottSzam = sc.nextInt();
        switch (iBeadottSzam) {
            case 1:
                System.out.println(" Hetfo van ");
                break;
            case 2:
                System.out.println(" Kedd van ");
                break;
            case 3:
                System.out.println(" Szerda van ");
                break;
            case 4:
                System.out.println(" Csutortok  van ");
                break;
            case 5:
                System.out.println(" Pentek van ");
                break;
            case 6:
                System.out.println(" Szombat van ");
                break;
            case 7:
                System.out.println(" Vasarnap van ");
                break;
        }
        if (iBeadottSzam > 7) {
            System.out.println(" Probalkozz ujra ");
        }
    }
}