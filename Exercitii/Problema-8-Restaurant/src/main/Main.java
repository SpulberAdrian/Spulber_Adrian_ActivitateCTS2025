package main;

import clase.Componenta;
import clase.Item;
import clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Componenta componenta = new Sectiune("Meniu");
        Componenta bauturi = new Sectiune("Bauturi");
        bauturi.adauga(new Item("Spritz"));
        bauturi.adauga(new Item("Aperol"));
        Componenta desert = new Sectiune("Desert");
        desert.adauga(new Item("Diplomat"));
        desert.adauga(new Item("Toffee"));

        componenta.adauga(bauturi);
        componenta.adauga(desert);
        componenta.afiseaza();
    }
}
