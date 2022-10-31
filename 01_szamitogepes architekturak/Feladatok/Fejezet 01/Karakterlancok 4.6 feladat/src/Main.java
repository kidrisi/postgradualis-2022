import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);

        System.out.println(" Adjon meg egy szamot");
        int iszam = nc.nextInt();
        Random e = new Random();
        int i1 ;
        int i2;
        int i3;
        switch (iszam) {
            case 5:
                int iSzamok = '9'-'0'+1;
                int iKisbetuk = 'z'-'a'+1;
                int iNagybetuk = 'Z'-'A'+1;
               int iOsszesKarakter = iKisbetuk+iNagybetuk+iSzamok;
               int iVeletlenKarakter = e.nextInt(iOsszesKarakter);
               if (iVeletlenKarakter <= iSzamok)
                   System.out.println (iVeletlenKarakter);
               else if(iVeletlenKarakter>iSzamok&&iVeletlenKarakter<=(iNagybetuk+iSzamok))
                  System.out.println((char)(64+iVeletlenKarakter));
               else if(iVeletlenKarakter>iSzamok+iKisbetuk)
                   System.out.println ((char)(96+(iVeletlenKarakter-(iSzamok+iNagybetuk))));
              // String d = String.valueOf(((iNagybetuk- (iOsszesKarakter -iVeletlenKarakter))));
               //char h = (char) (iNagybetuk- (iOsszesKarakter -iVeletlenKarakter));
                //System.out.println(h);








                System.out.println(iVeletlenKarakter);
                break;
            case 6:
                char dVeletlen4 = (char) e.nextInt('A', 'Z');
                char dVeletlen5 = (char) e.nextInt('a', 'z');
                char dVeletlen6 = (char) e.nextInt('1', '9' + 1);
                System.out.println(dVeletlen4 + " " + dVeletlen5 + " " + dVeletlen6);
                break;
            case 7:
                char dVeletlen7 = (char) e.nextInt('A', 'Z');
                char dVeletlen8 = (char) e.nextInt('a', 'z');
                char dVeletlen9 = (char) e.nextInt('1', '9' + 1);
                System.out.println(dVeletlen7 + " " + dVeletlen8 + " " + dVeletlen9);
                break;
            case 8:
                char dVeletlen10 = (char) e.nextInt('A', 'Z');
                char dVeletlen11 = (char) e.nextInt('a', 'z');
                char dVeletlen12 = (char) e.nextInt('1', '9' + 1);
                System.out.println(dVeletlen10 + " " + dVeletlen11 + " " + dVeletlen12);
                break;
            case 9:
                char dVeletlen13 = (char) e.nextInt('A', 'Z');
                char dVeletlen14 = (char) e.nextInt('a', 'z');
                char dVeletlen15 = (char) e.nextInt('1', '9' + 1);
                System.out.println(dVeletlen13 + " " + dVeletlen14 + " " + dVeletlen15);
                break;
            case 10:
                char dVeletlen16 = (char) e.nextInt('A', 'Z');
                char dVeletlen17 = (char) e.nextInt('a', 'z');
                char dVeletlen18 = (char) e.nextInt('1', '9' + 1);
                System.out.println(dVeletlen16 + " " + dVeletlen17 + " " + dVeletlen18);
                break;
        }
        //e.nextDouble();


        // int VeletlenSzam = nc.nextInt(e.nextInt());
        //System.out.println(VeletlenSzam);
        //char dVeletlen1 = (char) e.nextInt('A', 'Z'+1);
       // char dVeletlen2 = (char) e.nextInt('a', 'z'+1);
        //char dVeletlen3 = (char) e.nextInt('0', '9'+1 );

    }
}