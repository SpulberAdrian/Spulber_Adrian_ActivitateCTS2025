package main;

import clase.IRezervare;
import clase.ProxyRezervare;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new ProxyRezervare(new Rezervare());

        rezervare.realizeazaRezervare(2);
        rezervare.realizeazaRezervare(5);
    }
}
