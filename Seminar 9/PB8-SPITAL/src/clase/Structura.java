package clase;

public abstract class Structura {
    protected String nume;
    protected int nrAngajati;

    public Structura(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    public abstract void adauga(Structura structura) throws Exception;
    public abstract void sterge(Structura structura) throws Exception;
    public abstract void afiseaza();
    public abstract Structura getNod(int index) throws Exception;
    public abstract int getNrAngajati();
}
