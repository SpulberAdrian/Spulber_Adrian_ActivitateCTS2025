package main;

import clase.Printeaza;
import clase.PrinteazaBiletStandard;
import clase.PrinterLaMultiAni;

public class Main {
    public static void main(String[] args) {
        boolean eZiNationala = false;
        Printeaza printer = new PrinteazaBiletStandard();
        if(eZiNationala){
            printer = new PrinterLaMultiAni(printer);
        }

        printer.printeazaBilet();
    }
}
