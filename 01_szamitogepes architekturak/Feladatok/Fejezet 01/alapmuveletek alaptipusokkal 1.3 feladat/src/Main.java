import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Addj meg egy 8 bites egesz szamot : ");
        Byte b1 = sc.nextByte();
        System.out.println(" Add meg  a masodik 8 bites egesz szamot : ");
        Byte b2 = sc.nextByte();
        if (b1 > b2) {
            System.out.println(" Az elso szam a nagyobb : " + b1);}
        if ( b1 < b2) {
            System.out.println("A masodik szam a nagyobb : "+ b2);}
        if (b1 == b2) {
            System.out.println(" A ket szam egyenlo "+ b1 + " = " +b2);


           }
        }
    }



