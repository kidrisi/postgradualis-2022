import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Irjon be egy szavat :");
        String sSzo = sc.nextLine().toUpperCase();
        int iSzohossz = sSzo.length();
        for (int i = 0; i < iSzohossz / 2; i++) {
            if (sSzo.charAt(i) != sSzo.charAt(iSzohossz - (i + 1))) {
                System.out.println("Ez nem palindrom");
                break;
            }
        }sc.nextLine();
        System.out.println("Ez egy  palindrom");

    }
}
