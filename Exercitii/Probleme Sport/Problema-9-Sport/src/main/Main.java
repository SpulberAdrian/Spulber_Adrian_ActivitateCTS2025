package main;

import clase.Componenta;
import clase.Sectiune;
import clase.Subsectiune;

public class Main {
    public static void main(String[] args) {
        Componenta sectiune = new Sectiune("Stadion");
        Componenta Tribuna = new Sectiune("Tribuna");
        Componenta Peluza = new Sectiune("Peluza");


        Subsectiune tribunaNord = new Subsectiune("Tribuna Nord");
        Subsectiune tribunaSud = new Subsectiune("TribunaSud");
        Subsectiune peluzaVIP = new Subsectiune("PeluzaVip");
        sectiune.adauga(Tribuna);
        sectiune.adauga(Peluza);
        Tribuna.adauga(tribunaNord);
        Tribuna.adauga(tribunaSud);
        Peluza.adauga(peluzaVIP);

        sectiune.afiseaza();
    }
}
