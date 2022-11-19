
//Írj egy programot ami bekér egy karakterláncot és az
// első betű összes előfordulását kicseréli !-re, kétféle képpen.
// Egyik esetben karakterláncfeldolgozó műveletekkel,
// a másik esetben egy Java beépített metódus használatával (google a barátod).
// Ha jól dolgozol, a két megoldás azonos kell legyen.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println(" Adjon meg egy karakterlancot !");
        String sKarakter = "kakukk";
        //int iSzohossz = sKarakter.length();
        int a = 0;
        char cElso = (sKarakter.toLowerCase().charAt(0));
        char cFelkijaltojel = '!';
        for (int i = 0; i < sKarakter.length(); i++) {
            if (sKarakter.toLowerCase().charAt(i) == cElso) {
                String sUjjj = cFelkijaltojel+ "" + sKarakter.charAt(i+1);
                System.out.print(sUjjj);
                 //System.out.print(cFelkijaltojel);
                //a++;
            } else {
                for (int j = 0; j < a; j++) {
                    //String sUjstring =  sKarakter.charAt(i));
                    //System.out.print(sUjstring);
                    //System.out.print( sKarakter.charAt(i));
                }
            }
        }
    }

