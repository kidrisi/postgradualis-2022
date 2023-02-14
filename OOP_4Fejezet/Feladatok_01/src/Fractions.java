public class Fractions {
    private int szamlalo;
    private int nevezo;

    public Fractions() {
        szamlalo = 0;
        nevezo = 0;

    }

    public Fractions Multiply(Fractions fraction) {
        Fractions newFraction = new Fractions();
        newFraction.setNevezo(fraction.nevezo * this.nevezo);
        newFraction.setSzamlalo(fraction.szamlalo * this.szamlalo);


        return newFraction;

    }

    public Fractions Devide(Fractions fraction) {
        Fractions newFraction = new Fractions();
        newFraction.setNevezo(fraction.nevezo * this.szamlalo);
        newFraction.setSzamlalo(fraction.szamlalo * this.nevezo);
        return newFraction;
    }

    public void setNevezo(int nevezo) {
        this.nevezo = nevezo;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }

    public Fractions addFraction(Fractions fraction) {
        Fractions newFraction = new Fractions();
        Fractions addFraction = new Fractions();
        int hanyados = 0;
        if (this.nevezo > fraction.nevezo && this.nevezo % fraction.nevezo == 0) {
            hanyados = this.nevezo / fraction.nevezo;
            newFraction.setSzamlalo(fraction.szamlalo * hanyados);
            newFraction.setNevezo(fraction.nevezo * hanyados);
            addFraction.setSzamlalo(this.szamlalo + newFraction.szamlalo);
            addFraction.setNevezo(this.nevezo);


        } else if (this.nevezo < fraction.nevezo && fraction.nevezo % this.nevezo == 0) {
            hanyados = fraction.nevezo / this.nevezo;
            newFraction.setSzamlalo(this.szamlalo * hanyados);
            newFraction.setNevezo(this.nevezo * hanyados);
            addFraction.setSzamlalo(fraction.szamlalo + newFraction.szamlalo);
            addFraction.setNevezo(fraction.nevezo);

        } else {
            newFraction.setSzamlalo(fraction.nevezo * this.szamlalo);
            newFraction.setNevezo(fraction.nevezo * this.nevezo);
            // meg kell a tort masik tagjat boviteni, majd elvegezni a muveletet, lehet hogy else if ag kell
        }


        return addFraction;


    }

    public boolean isDivisible(Fractions fraction) {
        Fractions newFraction = new Fractions();
        if (this.nevezo > fraction.nevezo && this.nevezo % fraction.nevezo == 0) {
            return true;
        } else if (this.nevezo < fraction.nevezo && fraction.nevezo % this.nevezo == 0) {
            return true;

        } else {
            return false;
        }
    }


}

