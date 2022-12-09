
//Írjon egy állapotgépet ami egy fotocellás ajtó működését modellezi.
// Modellezze, hogy milyen állapotai lehetnek,
// illetve milyen ingerek érhetnek egy fotocellás ajtót.

enum FotocellaAllapot {

    Nyilt,
    Zart,
    Nyilik,
    Csukodik

}
enum FotocellaEsemeny{

    bemenes,
    kijoves,
    kozte,
    elotteAllas
}


public class Main {
    public static void main(String[] args) {

        FotocellaAllapot FotocellasAjto = FotocellaAllapot.Nyilt;
        //bemenes
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.bemenes);
        //bemenes
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.bemenes);
        //kijoves
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.kijoves);
        //bemenes
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.bemenes);
        //kijoves
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.kijoves);
        //kijoves
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.kijoves);
        // kozteallas
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.kozte);
        //kijoves
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.kijoves);
        //bemenes
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.bemenes);
        // kozteallas
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.kozte);
        // elotteallas
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.elotteAllas);
        // elotteallas
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.elotteAllas);
        //kijoves
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.kijoves);
        //bemenes
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.bemenes);
        // kozteallas
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.kozte);
        //kijoves
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.kijoves);
        // kozteallas
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.kozte);
        // elotteallas
        FotocellasAjto = KovetkezoAllapot(FotocellasAjto,FotocellaEsemeny.elotteAllas);




    }


    private static FotocellaAllapot KovetkezoAllapot( FotocellaAllapot aktualisAllapot, FotocellaEsemeny aktualisEsemeny){
        switch (aktualisAllapot){
            case Nyilt:
                switch (aktualisEsemeny){
                    case bemenes :
                        return FotocellaAllapot.Csukodik;
                    case kijoves:
                        return FotocellaAllapot.Csukodik;
                    case kozte:
                        return FotocellaAllapot.Nyilt;
                    case elotteAllas:
                        return FotocellaAllapot.Csukodik;

                    default:throw new IllegalArgumentException();

                }
            case Zart:
                switch (aktualisEsemeny){
                    case bemenes :
                      return FotocellaAllapot.Nyilik;
                    case kijoves:
                        return FotocellaAllapot.Nyilik;
                    case kozte:
                        throw new IllegalArgumentException();
                    case elotteAllas:
                        return FotocellaAllapot.Zart;

                    default:
                        throw new IllegalArgumentException();

                }
            case Nyilik:
                switch (aktualisEsemeny){
                    case bemenes :
                        return FotocellaAllapot.Nyilt;
                    case kijoves:
                        return FotocellaAllapot.Nyilt;
                    case kozte:
                        return FotocellaAllapot.Nyilt;
                    case elotteAllas:
                        return FotocellaAllapot.Csukodik;

                    default:
                        throw new IllegalArgumentException();
                }
            case Csukodik:
                switch (aktualisEsemeny){
                    case bemenes :
                        return FotocellaAllapot.Nyilik;
                    case kijoves:
                        return FotocellaAllapot.Nyilik;
                    case kozte:
                        return FotocellaAllapot.Nyilik;
                    case elotteAllas:
                        return FotocellaAllapot.Zart;
                    default:
                        throw new IllegalArgumentException();
                }default:
                throw new IllegalArgumentException();

        }



    }
}