
//Írj egy programot ami bekér egy szöveget. Ezt a szöveget vesszők mentén feldarabolja,
// majd kiírja az összes előforduló szót, de csak egyszer.
// Pl.: „alma, körte, alma, kukorica” bemenetre
// „alma, körte, kukorica” íródik a képernyőre.
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sVesszo = ',';
        int SzovegVege = 0;
        int SzovegEleje = 0;
        int Vesszofigyelo = 0;
        int Szopozicio = 0;
        int Tombeleme = 0;
        int SzavakSzama = 0;
        boolean Osszehasonlitas = true;
        //    System.out.println("Adja meg a szoveget ");
       // String sSzoveg = "abc, def, abc, efg, efg, abc, def, abc, h, i, i, s, h";
        String sSzoveg = "alma, kukac, alma, ".repeat(100);
        long start = System.currentTimeMillis();
        String SSzovegVesszoAvegen = sSzoveg + ",";
        Vesszofigyelo = Vesszoellenorzo(Vesszofigyelo, SSzovegVesszoAvegen);
        String[] Szo = new String[Vesszofigyelo];
        for (int i = 0; i < SSzovegVesszoAvegen.length(); i++) {
            if ((',') != SSzovegVesszoAvegen.charAt(i)) {
                SzovegVege++;
            } else {
                Szo[Szopozicio] = SSzovegVesszoAvegen.substring(SzovegEleje, SzovegVege);
                if (Tombeleme > 0) {
                    for (int j = 0; j <= (SzavakSzama - 1); j++) {
                        String Szohasonlitas = SSzovegVesszoAvegen.substring(SzovegEleje, SzovegVege);
                        if (Szohasonlitas.compareToIgnoreCase(Szo[j]) != 0) {
                            Osszehasonlitas = true;
                        } else if (Szohasonlitas.compareToIgnoreCase(Szo[j]) == 0) {
                            Osszehasonlitas = false;
                            break;
                        }
                    }
                }
                if (Osszehasonlitas == true)
                    System.out.println(SSzovegVesszoAvegen.substring(SzovegEleje, SzovegVege) + " , ");
                Szopozicio++;
                SzovegEleje = SzovegVege + 2;
                SzovegVege++;
                Tombeleme++;
                SzavakSzama++;
                Osszehasonlitas = false;
            }         long end = System.currentTimeMillis();
            System.out.println(end-start);
        }
    }

    private static int Vesszoellenorzo(int Vesszofigyelo, String SSzovegVesszoAvegen) {
        for (int i = 0; i < SSzovegVesszoAvegen.length(); i++) {
            if ((',') == SSzovegVesszoAvegen.charAt(i))
                Vesszofigyelo++;
        }
        return Vesszofigyelo;
    }
}
