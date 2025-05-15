package main;

import clase.InternareAdult;
import clase.InternareCopil;
import clase.InternarePacient;

public class Main {
    public static void main(String[] args) {
        InternarePacient adult = new InternareAdult();
        adult.interneaza();
        InternareCopil copil = new InternareCopil();
        copil.interneaza();
    }
}
