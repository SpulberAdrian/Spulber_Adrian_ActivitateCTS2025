package main;

import clase.Decorator;
import clase.IMesajBilet;
import clase.MesajBilet;
import clase.MesajSustinere;

public class Main {
    public static void main(String[] args) {
        IMesajBilet bilet = new MesajBilet();
        bilet.afiseaza();

        Decorator decorator = new MesajSustinere(bilet);
        decorator.afiseaza();
    }
}
