package main;

import clase.ContBancar;
import clase.ContProxy;
import clase.ICreare;

public class Main {
    public static void main(String[] args) {
        ICreare cont = new ContProxy(new ContBancar());

        cont.creareContBancar("RON");
        cont.creareContBancar("EURO");
    }
}
