import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Irjon be egy szavat :");
        String sSzo = sc.nextLine().toUpperCase();
        int iSzohossz = sSzo.length();
        for (int i = 0; i < iSzohossz / 2; i++) {
            int iPalindrom = Integer.parseInt(String.valueOf(String.valueOf(sSzo.charAt(i)).compareTo(String.valueOf(sSzo.charAt(iSzohossz - (i + 1))))));
            if (iPalindrom > 0 || iPalindrom < 0 ) {
                System.out.println("Ez nem palindrom");
                break;
            }
        }sc.nextLine();
        System.out.println("Ez egy  palindrom");

    }
}
