package main;

import clase.Adaptor;
import clase.EBilet;
import clase.IVanzareBilet;
import clase.VanzareBilet;

public class Main {
    public static void main(String[] args) {
        IVanzareBilet bilet = new VanzareBilet();
        bilet.vanzare();

        EBilet eBilet = new EBilet();
        IVanzareBilet adaptor = new Adaptor(eBilet);
        adaptor.vanzare();
    }
}
