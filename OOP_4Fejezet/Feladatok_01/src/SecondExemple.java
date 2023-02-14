public class SecondExemple {
    public static void main(String[] args) {
        String word = " ";

        for (int i = 0; i < args.length; i++) {
            word = args[i];
            for (int j = 0; j < word.length(); j++) {
                if (Character.isUpperCase(word.charAt(j))) {

                    System.out.print(Character.toLowerCase(word.charAt(j)));

                } else {
                    System.out.print(Character.toUpperCase(word.charAt(j)));

                }
            }
            System.out.println();

        }


    }
}
