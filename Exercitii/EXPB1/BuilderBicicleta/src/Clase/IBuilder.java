package Clase;

public interface IBuilder {

    Bicicleta buildBicicleta();
    IBuilder diametruRoti(int diametruRoti);
    IBuilder tipFrana(String tipFrana);
    IBuilder cascaProtectie(Boolean cascaProtectie);
    IBuilder ochelari(Boolean ochelari);
}
