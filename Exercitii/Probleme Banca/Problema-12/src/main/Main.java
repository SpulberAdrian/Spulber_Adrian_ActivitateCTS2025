package main;

import clase.Banca;
import clase.ClientAbonat;
import clase.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect banca = new Banca();
        ClientAbonat client1 = new ClientAbonat("Popa");

        banca.adaugaObserver(client1);
        banca.notificaObserver("Ai o oferta noua");
    }
}
