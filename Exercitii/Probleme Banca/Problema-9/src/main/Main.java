package main;

import clase.Componenta;
import clase.Item;
import clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Componenta Sucursala = new Sectiune("Main");
        Componenta agentie = new Sectiune("Agentia Bucuresti");
        Componenta filiala = new Item("Tei ");
        Sucursala.adauga(agentie);
        agentie.adauga(filiala);

        Sucursala.afiseaza();
    }
}
