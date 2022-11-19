import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Szo;
        int leghosszabb = -1;
        do {
            System.out.println(" Adjon meg egy karakterlancot ");
            Szo = sc.nextLine();
            if (leghosszabb < Szo.length()) {
                leghosszabb = Szo.length();
            }
        } while (!Szo.equals("*"));

        System.out.println("a leghosszab karakterlanc " + leghosszabb + " karakterbol allt ");
    }
}