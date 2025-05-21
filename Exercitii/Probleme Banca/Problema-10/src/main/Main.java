package main;

import clase.ContFactory;
import clase.InformatiiBanca;
import clase.InformatiiCont;

public class Main {
    public static void main(String[] args) {
        ContFactory factory = new ContFactory();
        InformatiiCont cont1 = factory.getCont("Popescu","Republicii", "072020202", "popescu@tei");

        InformatiiBanca banca = new InformatiiBanca("BCR","Tei",1000, cont1);
        InformatiiBanca banca2 = new InformatiiBanca("BRD","Rahova",1000123, cont1);

        System.out.println(banca.toString());
        System.out.println(banca2.toString());
    }
}
