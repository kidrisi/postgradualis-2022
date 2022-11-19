import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Szoveg = "";
        while (!Szoveg.equals("Exit")) {
            sc.nextLine();
            System.out.println(" Irja be a kivant szoveget. Ha nem szeretne tobbet irni irja be: Exit");
            Szoveg = sc.nextLine();
            for (int i = 0; i < Szoveg.length(); i++) {
                if (Szoveg.equals("Exit"))
                    break;
                System.out.print(Szoveg.charAt(Szoveg.length() - (i + 1)));
            }
        }
        System.out.println("Vege");
    }
}
