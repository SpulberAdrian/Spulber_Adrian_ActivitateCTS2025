package main;

import clase.FrameworkAdapter;
import clase.FrameworkNou;
import clase.Oferta;
import clase.OfertaLeasing;

public class Main {
    public static void main(String[] args) {
        Oferta ofertaLeasing = new OfertaLeasing();
        ofertaLeasing.afisareOferta();

        FrameworkNou frameworkNou = new FrameworkNou();
        FrameworkAdapter adaptor = new FrameworkAdapter(frameworkNou);
        adaptor.afisareOferta();
    }
}
