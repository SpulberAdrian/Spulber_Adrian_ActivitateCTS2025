package main;

import clase.Cumparator;
import clase.ICumparator;
import clase.ProxyCumparator;

public class Main {
    public static void main(String[] args) {
        ICumparator cumparator1 = new ProxyCumparator(new Cumparator());
        cumparator1.vanzare(15);
    }
}
