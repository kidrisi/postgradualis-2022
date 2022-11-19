import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Hany erteket szertenel beolvasni 1-5 ig ?");
        int iNevekSzama = sc.nextInt();
        sc.nextLine();
        String [] Nevek = new String[iNevekSzama];
        for (int i = 0; i < iNevekSzama; i++) {
            System.out.println("Adja meg a " +  (i+1) +  " nevet ");
            Nevek[i]=sc.nextLine();
        }
        int TombHossza = Nevek.length;
        int [] Szamok = {2,4,6,8,10};
        System.out.println(" Kiiras : "+ Arrays.toString(Szamok));







    }
}