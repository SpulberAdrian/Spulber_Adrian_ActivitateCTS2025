package clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends Componenta{
    private String nume;
    public List<Componenta> lista = new ArrayList<>();

    public Sectiune(String nume) {
        this.nume = nume;
    }

    public void adauga(Componenta componenta){
        lista.add(componenta);
    }

    public void sterge(Componenta componenta){
        lista.remove(componenta);
    }

    public void afiseaza(){
        System.out.println(nume);
        for(Componenta componenta:lista)
        {
            componenta.afiseaza();
        }
    }
}
