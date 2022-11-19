import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg az elso  keresztnevet : ");
        String SKeresztnev1 = sc.nextLine();
        System.out.println("Adj meg a masodik  keresztnevet : ");
        String SKeresztnev2 = sc.nextLine();
        System.out.println("Add meg a harmadik  keresztnevet : ");
        String SKeresztnev3 = sc.nextLine();
        System.out.println(" Nevek forditott sorrendben : " + SKeresztnev3 + " " + SKeresztnev2 + " " + SKeresztnev1);


    }
}