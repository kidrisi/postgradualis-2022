import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println(" Adjon meg egy karakterlancot !");
        String sKarakter = sc.nextLine();
        char cElso = (sKarakter.toLowerCase().charAt(0));
        for (int i = 0; i < sKarakter.length(); i++) {
            if(sKarakter.charAt(i)==cElso){
              char c = '!';
                System.out.print(c);
            }else {
                System.out.print(sKarakter.charAt(i));
            }
        }
    }
}