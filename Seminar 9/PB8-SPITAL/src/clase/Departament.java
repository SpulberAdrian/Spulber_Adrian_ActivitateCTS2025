package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament extends Structura{

    private List<Structura> lista = new ArrayList<>();

    public Departament(String nume, int nrAngajati) {
        super(nume, nrAngajati);
    }

    @Override
    public void adauga(Structura structura) {
        lista.add(structura);
    }

    @Override
    public void sterge(Structura structura) {
        lista.remove(structura);
    }

    @Override
    public void afiseaza() {
        System.out.println("Departamentul "+ nume);
        for(Structura structura:lista)
            structura.afiseaza();
    }

    @Override
    public Structura getNod(int index) {
        return lista.get(index);
    }

    @Override
    public int getNrAngajati() {
        int suma = 0;
        for (Structura structura:lista)
            suma+=structura.nrAngajati;
        return suma + this.nrAngajati;
    }
}
