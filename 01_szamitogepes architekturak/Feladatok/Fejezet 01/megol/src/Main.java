import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Szo;
        int a = 0;
        int [ ]iSzavak= new int[5];
        do{
            System.out.println(" Adjon meg egy karakterlancot ");
            Szo = sc.nextLine();
            iSzavak[a]=Szo.length();
            a++;

            } while (!Szo.equals ("*"));
             int leghosszabb = 0;
             for (int i = 0; i <iSzavak.length ; i++) {
                 if(leghosszabb< iSzavak[i]){
                     leghosszabb= iSzavak[i];
                 }

        }System.out.println("a leghosszab karakterlanc " + leghosszabb + " karakterbol allt ");

        }
         {
        }
    }



