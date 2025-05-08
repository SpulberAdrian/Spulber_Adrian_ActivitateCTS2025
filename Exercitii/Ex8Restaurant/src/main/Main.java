package main;

import clase.ComponentaMeniu;
import clase.MenuItem;
import clase.MenuSection;

public class Main {
    public static void main(String[] args) {
        ComponentaMeniu meniu = new MenuSection("Main Menu");

        ComponentaMeniu startere = new MenuSection("starter");
        ComponentaMeniu bauturi = new MenuSection("bauturi");
        ComponentaMeniu desert = new MenuSection("deser");

        startere.adaugaNod(new MenuItem("salam"));
        bauturi.adaugaNod(new MenuItem("suc"));
        desert.adaugaNod(new MenuItem("prajitura"));
        meniu.adaugaNod(startere);
        meniu.adaugaNod(bauturi);
        meniu.adaugaNod(desert);
        meniu.afiseazaMeniu();
    }
}
