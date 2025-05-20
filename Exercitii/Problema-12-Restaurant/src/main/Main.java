package main;

import clase.ClientFidel;
import clase.Observer;
import clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Observer client = new ClientFidel("Gigi");

        restaurant.adaugareObserver(client);
        restaurant.notificareObserver("Avem o oferta noua la Pizza");
        restaurant.stergereObserver(client);
    }
}
