public class FirstExemple {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        int number = 0;
        for (int j = 0; j < args.length; j++) {
            try {
                number = Integer.parseInt(args[j]);
                if (number % 2 == 0) {
                    evenSum += number;
                } else {
                    oddSum += number;
                }

            } catch (NumberFormatException e2) {

            }


        }
        System.out.println("Paros szamok osszege: " + evenSum);
        System.out.println("Paratkan szamok osszege: " + oddSum);


    }


}