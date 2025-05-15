package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Handler Troleibuz = new Troleibuz();
        Handler Autobuz = new Autobuz();
        Handler Tramvai = new Tramvai();
        Handler Metrou = new Metrou();


        Troleibuz.setNext(Autobuz);
        Autobuz.setNext(Tramvai);
        Tramvai.setNext(Metrou);

        Troleibuz.recomanda(2);
        Autobuz.recomanda(4);
        Tramvai.recomanda(7);
        Metrou.recomanda(11);
    }
}
