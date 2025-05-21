package main;

import clase.Handler;
import clase.PlataCardCredit;
import clase.PlataCardDebit;
import clase.PlataCardStar;

public class Main {
    public static void main(String[] args) {
        Handler plataDebit =  new PlataCardDebit();
        Handler plataCredit = new PlataCardCredit();
        Handler plataStar = new PlataCardStar();

        plataDebit.setNext(plataCredit);
        plataCredit.setNext(plataStar);

        plataDebit.plateste();
    }
}
