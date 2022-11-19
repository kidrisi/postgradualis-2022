import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  String s;
        // do {
        // ismetelendo utasitasok
        //System.out.println("Adjon meg egy karakterlancot: ");
        // s = sc.nextLine();
        // } while (s.compareTo("Exit") != 0);

        // boolean elsoEllenorzes = true;
        // for (; elsoEllenorzes || s.compareTo("Exit") != 0;){
        //  elsoEllenorzes = false;
        //  System.out.println("Adjon meg egy karakterlancot: ");
        //  s = sc.nextLine();
        //}

        //System.out.println("Vege.");
        System.out.println("Hany nevet szeretne megadni: 1-5 ig");
        int nevekSzama = sc.nextInt();
        String[] nevek = new String[nevekSzama];
        for (int beolvasandoNevSorszama = 0; beolvasandoNevSorszama < nevekSzama; beolvasandoNevSorszama++) {
            System.out.println("Addj meg az " + (beolvasandoNevSorszama + 1) + ". nevet: ");

        }
    }
}

