package main;

import clase.AMetrou;
import clase.Metrou;
import clase.MetrouSpecial;

public class Main {
    public static void main(String[] args) {
        AMetrou metrou = new Metrou(5);
        metrou.circulaTur();
        metrou.circulaRetur();
        AMetrou metrouSpecial = new MetrouSpecial(6);
        metrouSpecial.circulaTur();
        metrouSpecial.circulaRetur();

    }
}
