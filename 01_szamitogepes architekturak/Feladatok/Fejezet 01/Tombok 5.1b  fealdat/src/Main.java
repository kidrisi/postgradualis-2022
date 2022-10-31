import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nevek = new String[3];
        System.out.println("Kerem adja meg az elso keresztnevet !");
        nevek[0] = sc.nextLine();
        System.out.println("Kerem adja meg a masodik  keresztnevet !");
        nevek[1] = sc.nextLine();
        System.out.println("Kerem adja meg a harmadik  keresztnevet !");
        nevek[2] = sc.nextLine();
        System.out.println(" Nevek forditott sorrendben: " + " , " + nevek[2] + " , " + nevek[1] + " , " + nevek[0]);
        //System.out.println(nevek.length);lekerdezes a tombok elemeinek szama

    }
}