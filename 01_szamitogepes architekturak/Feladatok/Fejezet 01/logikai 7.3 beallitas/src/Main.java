public class Main {
    public static void main(String[] args) {

        if (atlakitasHelyes(false, false)
                && (atlakitasHelyes(true, false)
                && (atlakitasHelyes(false, true)
                && (atlakitasHelyes(true, true)))))
        {
            System.out.println(" A sorompo nyit ");
        } else{
            System.out.println(" A sorompo nem nyit ");
        }

    }

    private static boolean feltetelaFeladatban(boolean a, boolean b) {
        if (a || b)
    {
            return true;
        }else{
            return false;
        }
    }

    private static boolean feltetelAtfogamnazav(boolean a, boolean b) {
        if ((a&&b)||(a&&!b) ||(!a&&b)) {
            return true;
        } else {
            return false;
        }
    }




    private static boolean atlakitasHelyes(boolean a, boolean b) {
        return feltetelaFeladatban(a, b) == feltetelAtfogamnazav(a, b);
    }
}
