package clase;

public class Calator {
    private String nume;
    private IMetodaPlata metodaPlata;


    public Calator(String nume) {
        this.nume = nume;
        metodaPlata = new CardBancar(100);
    }

    public Calator(String nume, IMetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {  //obligatoriu!!
        this.metodaPlata = metodaPlata;
    }

    public void plataCalatorie(float pretBilet){
        metodaPlata.plateste(pretBilet);
    }
}
