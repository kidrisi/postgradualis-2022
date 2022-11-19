public class Main {
    public static void SwapArray(int[] theArray, int i, int j) {
        int tempValue = 0;
        tempValue = theArray[i];
        theArray[i] = theArray[j];
        theArray[j] = tempValue;

    }
}