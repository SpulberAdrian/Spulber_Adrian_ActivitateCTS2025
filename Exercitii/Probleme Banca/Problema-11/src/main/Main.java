package main;

import clase.Client;
import clase.PersoanaFizica;
import clase.PersoanaJuridica;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setStrategie(new PersoanaFizica());
        client.efectuareVerificare();

        client.setStrategie(new PersoanaJuridica());
        client.efectuareVerificare();
    }
}
