public class ThirdExemple {
    public static void main(String[] args) {
        int[][] array;
        int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex1) {
            number = 10;
        }
        array = new int[number][];
        int countnumber = 0;
        for (int i = 0; i < number; i++) {
            System.out.println();
            array[i] = new int[i + 1];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = countnumber++;
                System.out.print(" " + array[i][j]);
            }

        }

    }
}
