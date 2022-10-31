//Írj programot ami beolvas egy egész, majd eldönti, hogy az alábbi esetek közül melyik áll fenn:
//        a. a szám páratlan
//        b. a szám páros és osztható néggyel, de nem osztható nyolccal
//        c. a szám páros és osztható nyolccal és néggyel is
//        d. a szám páros de nem osztható sem nyolccal sem néggyel
//        e. valami más féle szám

//Írj programot ami beolvas egy egész, majd eldönti, hogy az alábbi esetek közül melyik áll fenn:
//a. a szám páratlan
//b. a szám páros és osztható néggyel, de nem osztható nyolccal
//c. a szám páros és osztható nyolccal és néggyel is
//d. a szám páros de nem osztható sem nyolccal sem néggyel
//e. valami más féle szám


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Adj meg egy egesz szamot : ");
        int iSzam = sc.nextInt();
        if (iSzam % 2 != 0) {
            System.out.println(" A szam paratlan ");
        } else if (iSzam % 2 == 0 && (iSzam % 4 == 0 && iSzam % 8 != 0)) {
            System.out.println("A szam paros es oszthato 4 -el de nem oszthato 8 -al");
        } else if (iSzam % 2 == 0 && (iSzam % 8 == 0 && iSzam % 4 == 0)) {
            System.out.println(" A szám páros és osztható nyolccal és néggyel is");
        } else if (iSzam % 2 == 0 &&(iSzam % 8 != 0 && iSzam % 4 != 0)){
            System.out.println(" A szám páros de nem osztható sem nyolccal sem néggyel");
        }else{
            System.out.println("Valami más féle szám");
        }


    }
}