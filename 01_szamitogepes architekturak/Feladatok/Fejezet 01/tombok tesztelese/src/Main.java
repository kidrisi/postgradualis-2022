import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Tomb letrehozasa
        String[][] sAdatok = new String[7][];
        System.out.println(sAdatok.length);
        sAdatok[0] = new String[1];
        sAdatok[0][0] = " s";
        String Teszt = "beatrix";
        int SzovegHossz = Teszt.length();
        char Elsobetu = Teszt.charAt(0);
        char Masodikbet = Teszt.charAt(Teszt.length() - 1);
        int iMaradekKarakter = SzovegHossz - 2;
        if (iMaradekKarakter > 1) {
            String Uj = Teszt.substring(1, iMaradekKarakter + 1);
            System.out.println(Uj);
            int Ujszoveghossz = Uj.length();
            char cU1 = Uj.charAt(0);
            char cU2 = Uj.charAt(Uj.length() - 1);
            int iMaradekkarakter2 = Ujszoveghossz - 2;
            //System.out.println(iMaradekkarakter2);
        }
        String[] Betu = new String[SzovegHossz];
        Betu[0] = String.valueOf(Teszt.charAt(0));
        Betu[Teszt.length() - 1] = String.valueOf(Teszt.charAt(Teszt.length() - 1));

        //System.out.println(" Egyelore ez van");

         String Tesztecske = "aladar";
         int Hossz = Tesztecske.length();
         int UjHossz = Hossz-2;
         String UjSzoveg = Tesztecske.substring(1,UjHossz+1);
        int Szam = 2;
         while (Szam<14){
             Szam++;
         }
         String Dd = "peter ";
         char[] xs= Dd.toCharArray();











        //extracted(Tesztecske);


    }

    private static void extracted(String Tesztecske) {
        int KarakterHossza = Tesztecske.length();


        int Maradek = KarakterHossza - 2;
        String Karaktersub= Tesztecske.substring(1,Maradek+1);

        System.out.println(Karaktersub);
    }


}


