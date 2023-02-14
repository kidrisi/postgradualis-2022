public class Main {
    public static void main(String[] args) {
        Fractions ujTort = new Fractions();
        Fractions ujTort2 = new Fractions();
        Fractions ujTort3 = new Fractions();
        ujTort2.setNevezo(3);
        ujTort2.setSzamlalo(5);
        ujTort.setNevezo(5);
        ujTort.setSzamlalo(2);
        // ujTort3= ujTort2.addFraction(ujTort);
        ujTort3= ujTort.Multiply(ujTort2);


    }
}