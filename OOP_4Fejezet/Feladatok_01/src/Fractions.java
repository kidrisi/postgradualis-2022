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

    public Fractions Devidy(Fractions fraction) {
        Fractions newFraction = new Fractions();
        newFraction.setNevezo(fraction.szamlalo * this.nevezo);
        newFraction.setSzamlalo(fraction.nevezo * this.szamlalo);
        return newFraction;
    }

    public void setNevezo(int nevezo) {
        this.nevezo = nevezo;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }
}

