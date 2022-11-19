import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] iVeletlenSzamok = new int[3];
        for (int i = 0; i < 3; i++) {
            iVeletlenSzamok[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(iVeletlenSzamok));



    }

    public static void SwapArray(int[] theArray, int i, int j) {
        int tempValue = 0;
        tempValue = theArray[i];
        theArray[i] = theArray[j];
        theArray[j] = tempValue;
    }

}



