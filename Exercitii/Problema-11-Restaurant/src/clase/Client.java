package clase;

public class Client {
    StrategiePlata strategie;

    public void setStrategie(StrategiePlata strategie){
        this.strategie = strategie;
    }

    public void efectuarePlata(int suma){
        strategie.plateste(suma);
    }

}
