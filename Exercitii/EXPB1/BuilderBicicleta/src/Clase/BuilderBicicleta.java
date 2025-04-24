package Clase;

public class BuilderBicicleta implements  IBuilder{

    private int diametruRoti;
    private String tipFrana;
    private Boolean cascaProtectie;
    private Boolean ochelari;


    @Override
    public Bicicleta buildBicicleta() {
        return new Bicicleta(diametruRoti,tipFrana,cascaProtectie,ochelari);
    }

    @Override
    public IBuilder diametruRoti(int diametruRoti) {
        this.diametruRoti = diametruRoti;
        return this;
    }

    @Override
    public IBuilder tipFrana(String tipFrana) {
        this.tipFrana = tipFrana;
        return this;
    }

    @Override
    public IBuilder cascaProtectie(Boolean cascaProtectie) {
        this.cascaProtectie = cascaProtectie;
        return this;
    }

    @Override
    public IBuilder ochelari(Boolean ochelari) {
        this.ochelari = ochelari;
        return this;
    }
}
