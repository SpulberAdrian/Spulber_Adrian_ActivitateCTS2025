package main;

import clase.Autobuz;
import clase.Calator;
import clase.MijlocTransport;
import clase.Observer;

public class Main {
    public static void main(String[] args) {
        Observer calator = new Calator("Calator 1");
        Observer calator2 = new Calator("Calator 2");
        Observer calator3 = new Calator("Calator 3");

        MijlocTransport autobuz = new Autobuz(100);
        autobuz.adaugaObserver(calator);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);

        autobuz.pleacaDeLaCapat();
        autobuz.stergeObserver(calator2);
        ((Autobuz)autobuz).schimbaTraseu();
    }
}
