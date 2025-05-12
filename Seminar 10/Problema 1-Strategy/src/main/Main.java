package main;

import clase.Calator;
import clase.CardCalatorie;
import clase.IMetodaPlata;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata CardCalatorie = new CardCalatorie(5);
        Calator calator = new Calator("Calator");

        calator.plataCalatorie(5);
        calator.setMetodaPlata(CardCalatorie);
        calator.plataCalatorie(5);
    }
}
