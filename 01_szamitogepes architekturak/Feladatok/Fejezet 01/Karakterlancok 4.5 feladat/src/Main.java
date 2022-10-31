import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerek egy karakterlancot ");
        String sKarakterlanc = sc.nextLine();
        char cElsoKar = sKarakterlanc.charAt(0);
        char cUtolsoKar = sKarakterlanc.charAt(sKarakterlanc.length() - 1);
        String sKozepe = sKarakterlanc.substring(1, sKarakterlanc.length() - 1);
        //System.out.println(sKozepe);
        System.out.println(cUtolsoKar + sKozepe + cElsoKar);
    }

}
