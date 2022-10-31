import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Adja meg a vezeteknevet");
        String sVezeteknev = sc.next();
        System.out.println(" Adja meg a keresztnevet ");
        String sKeresztnev = sc.next();
        String sVezeteknevNagybetu = sVezeteknev.toUpperCase();
        String sKisbetusitettVnev = sVezeteknev.toLowerCase();
        String sKisbetusitettKnev = sKeresztnev.toLowerCase();
        String sKeresztnevNagybetu = sKeresztnev.toUpperCase();
        char cVezeteknevElsoBetu = sVezeteknevNagybetu.charAt(0);
        char cKeresztnevElsoBetu = sKeresztnevNagybetu.charAt(0);
        String sFormazottVezeteknev = sKisbetusitettVnev.replace(sKisbetusitettVnev.charAt(0), cVezeteknevElsoBetu);
        String sFormazottKeresztnev = sKisbetusitettKnev.replace(sKisbetusitettKnev.charAt(0), cKeresztnevElsoBetu);
        System.out.println(sFormazottVezeteknev + "  " + sFormazottKeresztnev);


    }
}