package main;

import clase.Becali;
import clase.Handler;
import clase.SefPeluza;
import clase.SefTribuna;

public class Main {
    public static void main(String[] args) {

        Handler sefPeluza = new SefPeluza();
        Handler sefTribuna = new SefTribuna();
        Handler becali = new Becali();

        sefPeluza.setNext(sefTribuna);
        sefTribuna.setNext(becali);

        sefPeluza.gestionare();
    }
}
