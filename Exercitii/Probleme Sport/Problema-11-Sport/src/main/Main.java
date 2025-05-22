package main;

import clase.VerificarePeluza;
import clase.VerificareStrategy;

public class Main {
    public static void main(String[] args) {
        VerificareStrategy client1 = new VerificareStrategy();

        VerificarePeluza peluza = new VerificarePeluza();
        client1.setVerificare(peluza);
        client1.verificare();


    }
}
