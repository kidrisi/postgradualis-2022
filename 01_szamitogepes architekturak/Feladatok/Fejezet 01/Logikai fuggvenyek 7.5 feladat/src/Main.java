public class Main {
    public static boolean main(String[] args) {
        //boolean a = false;
        //boolean b = false;
        // boolean c = false;
        if (atalakitasHelyes(false, false, false)
                && atalakitasHelyes(false, false, true)
                && atalakitasHelyes(false, true, false)
                && atalakitasHelyes(false, true, true)
                && atalakitasHelyes(true, false, false)
                && atalakitasHelyes(true, false, true)
                && atalakitasHelyes(true, true, false)
                && atalakitasHelyes(true, true, true)) {
            System.out.println(" Jo atalakitas ");
        } else {
            System.out.println("Rossz atalakitas");
        }
    }



        private static boolean feltetelaFeladatban (boolean a,boolean b,boolean c ){
            if ((!a && b) || (!b && c) || (a && c) || (!a && !c) || (b && c)) {
                return true;
            } else {
                return false;
            }
        }

        private static boolean feltetelAtalakitva (boolean a, boolean b,boolean c){
            return !a || c;
        }



    private static boolean atalakitasHelyes(boolean a, boolean b, boolean c) {
        return feltetelaFeladatban(a, b, c) == feltetelAtalakitva(a, b, c);
    }}













