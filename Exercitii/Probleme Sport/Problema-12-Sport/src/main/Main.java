package main;

import clase.Client;
import clase.SalaDeSport;
import clase.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect salaDeSport = new SalaDeSport();

        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        Client client4 = new Client();
        salaDeSport.adauga(client1);
        salaDeSport.adauga(client2);
        salaDeSport.adauga(client3);
        salaDeSport.adauga(client4);
        salaDeSport.notificare("Aveti un loc liber astazi");
    }
}
