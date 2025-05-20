package main;

import clase.Client;
import clase.ClientFactory;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        ClientFactory factory = new ClientFactory();

        Client c1 = factory.getClient("Popescu","07222222","popescu@gmail");

        Rezervare r1 = new Rezervare(4,5,20,c1);
        Rezervare r2 = new Rezervare(5,20,21,c1);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
