public class Main {
    public static void main(String[] args) {

        if (atlakitasHelyes(false,true)
                &&(atlakitasHelyes(true,false)
                &&(atlakitasHelyes(false,true)
                &&(atlakitasHelyes(true,true))
         {
            System.out.println(" A sorompo nyit ");
        } else {
            System.out.println(" A sorompo nem nyit ");
        }

    }

    private static boolean elsoFeltetel(boolean a, boolean b) {
        if ( return a || b){
            return true;
        }else{
            return false;
        }
    }

    private static boolean masodikFeltetel(boolean a, boolean b) {
        if (a && b) {
            return true;
        } else {
            return false;
        }
    }


}
    private static boolean atlakitasHelyes(boolean a, boolean b) {
        return elsoFeltetel(a, b) == masodikFeltetel(a, b);}
    }





