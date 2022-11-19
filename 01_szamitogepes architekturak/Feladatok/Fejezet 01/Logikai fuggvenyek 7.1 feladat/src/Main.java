public class Main {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;


        if (atalakitasHelyes(a, b)
                && atalakitasHelyes(a,b)
                && atalakitasHelyes(a,b)
                && atalakitasHelyes(a,b)){
            System.out.println("Jo atalakitas");
        }else{
            System.out.println("Rossz atalakitas");
        }
    }

    private static boolean feltetelFeladatban(boolean a, boolean b) {
        if ((!a && !b) || (b && a) || (!b && a)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean feltetelAtalakitva(boolean a, boolean b) {
        {
            return a || b;
        }
    }

    private static boolean atalakitasHelyes(boolean a, boolean b) {
        return feltetelFeladatban(a, b) == feltetelAtalakitva(a, b);
    }}


