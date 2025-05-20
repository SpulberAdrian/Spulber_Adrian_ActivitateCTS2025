package main;

import clase.Card;
import clase.CardBancar;
import clase.CardContactless;

public class Main {
    public static void main(String[] args) {
        Card cardBancar = new CardBancar();
        cardBancar.plateste();

        Card cardDecorat = new CardContactless(cardBancar);
        cardDecorat.plateste();
    }
}
