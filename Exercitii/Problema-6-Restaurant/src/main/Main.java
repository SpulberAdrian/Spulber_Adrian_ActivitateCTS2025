package main;

import clase.VerificatorMasaFacade;

public class Main {
    public static void main(String[] args) {
        VerificatorMasaFacade verifica = new VerificatorMasaFacade();
        int nrMasa = 5;
        if(verifica.poateFiOcupapta(nrMasa)){
            System.out.println("Masa cu numarul " + nrMasa + " este pregatita");
        }else {
            System.out.println("Masa cu numarul " + nrMasa + "  nu este pregatita");
        }
    }
}
