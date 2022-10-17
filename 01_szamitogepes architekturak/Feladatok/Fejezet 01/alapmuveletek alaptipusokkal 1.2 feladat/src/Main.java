import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Adj meg egy tort erteket : ");
        double d1 = sc.nextDouble();
        System.out.println(" Add meg a masodik tort erteket : ");
        double d2 = sc.nextDouble();
        if (d2 == d1) {
            System.out.println(" A ket ertek egyenlo ");
        } else {
            System.out.println(" A ket ertek nem egyenlo ");

        }


    }
}