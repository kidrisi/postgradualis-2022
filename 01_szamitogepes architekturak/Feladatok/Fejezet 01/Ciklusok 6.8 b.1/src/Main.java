import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println(" Adja meg a szot!");
        int a = 0;
        int b = 0;
        String sSzo = " g ";
        while (!sSzo.equals("e")) {
            System.out.println(" Adja meg a szot!");
            sSzo = sc.nextLine();
            a = sSzo.length();
            // if (a > b) {
            // System.out.println(a);
            // } else {
            //System.out.println(b);
            b = sSzo.length();
        }

        }
    }

