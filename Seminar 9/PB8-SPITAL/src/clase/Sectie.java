package clase;

public class Sectie extends Structura{


    public Sectie(String nume, int nrAngajati) {
        super(nume, nrAngajati);
    }

    public void afiseaza(){
        System.out.println("Sectia " + this.nume);
    }

    @Override
    public Structura getNod(int index) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void adauga(Structura structura) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void sterge(Structura structura) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public int getNrAngajati() {
        return this.nrAngajati;
    }
}
