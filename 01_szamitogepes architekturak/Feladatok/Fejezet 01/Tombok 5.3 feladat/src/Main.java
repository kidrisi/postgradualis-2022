import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Adjon meg egy szamot 1 es 5 kozott !");
        int iSzam = sc.nextInt();

        switch (iSzam) {
            case 1:
                String[] sNev1 = new String[1];
                System.out.println(" Adjon meg egy nevet !");
                sNev1[0] = sc.next();
                System.out.println(sNev1[0]);
                break;
            case 2:
                System.out.println(" Adja meg az elso nevet !");
                String[] sNev2 = new String[2];
                sNev2[0] = sc.next();
                System.out.println(" Adja meg a masodik nevet !");
                sNev2[1] = sc.next();
                System.out.println(sNev2[1] + " " + sNev2[0]);
                break;
            case 3:
                System.out.println(" Adja meg az elso nevet !");
                String[] sNev3 = new String[3];
                sNev3[0] = sc.next();
                System.out.println(" Adja meg a masodik nevet !");
                sNev3[1] = sc.next();
                System.out.println(" Adja meg a harmadik nevet !");
                sNev3[2] = sc.next();
                System.out.println(sNev3[2] + " " + sNev3[1] + " " + sNev3[0]);
                break;
            case 4:
                System.out.println(" Adja meg az elso nevet !");
                String[] sNev4 = new String[4];
                sNev4[0] = sc.next();
                System.out.println(" Adja meg a masodik nevet !");
                sNev4[1] = sc.next();
                System.out.println(" Adja meg a harmadik nevet !");
                sNev4[2] = sc.next();
                System.out.println(" Adja meg a negyedik nevet !");
                sNev4[3] = sc.next();
                System.out.println(sNev4[3] + " " + sNev4[2] + " " + sNev4[1] + " " + sNev4[0]);
                break;
            case 5:
                System.out.println(" Adja meg az elso nevet !");
                String[] sNev5 = new String[5];
                sNev5[0] = sc.next();
                System.out.println(" Adja meg a masodik nevet !");
                sNev5[1] = sc.next();
                System.out.println(" Adja meg a harmadik nevet !");
                sNev5[2] = sc.next();
                System.out.println(" Adja meg a negyedik nevet !");
                sNev5[3] = sc.next();
                System.out.println(" Adja meg az otodik nevet!");
                sNev5[4] = sc.next();
                System.out.println(sNev5[4] + " " + sNev5[3] + " " + sNev5[2] + " " + sNev5[1] + " " + sNev5[0]);
                break;
        }
    }
}