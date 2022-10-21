import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println(" Adj meg egy egesz szamot :");
        int i1Egesz = nc.nextInt();
        System.out.println(" Adj meg egy 0 es 4 kozotti szamot :");
        int i2Egesz = nc.nextInt();
        int i1Bineltolas = i1Egesz >> i2Egesz;
        int i2Bineltolas = i1Egesz >>> i2Egesz;
        int i3Bineltolas = i1Egesz << i2Egesz;
        if (i2Egesz < 0) {
            System.out.println(" A feladat nem elvegezheto, a masodik ertek 0- 4 kozott kell legyen");
        } else if (i2Egesz > 4) {
            System.out.println(" A feladat nem elvegezheto, a masodik ertek 0- 4 kozott kell legyen");
        } else {
            System.out.println("  Eltolas >> erteke : " + i1Bineltolas + " " + " Eltolas >>> erteke : " + i2Bineltolas + " " + " << Eltolas erteke : " + i3Bineltolas);
        }
    }
}






