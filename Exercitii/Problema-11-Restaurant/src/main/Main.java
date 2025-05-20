package main;

import clase.Client;
import clase.PlataCard;
import clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setStrategie(new PlataCard());
        client.efectuarePlata(200);

        client.setStrategie(new PlataCash());
        client.efectuarePlata(100);
    }
}
