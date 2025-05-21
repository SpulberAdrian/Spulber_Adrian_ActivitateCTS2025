package main;

import clase.VerificariFacade;

public class Main {
    public static void main(String[] args) {
        VerificariFacade verifica = new VerificariFacade();

        int varsta = 18;
        if(verifica.esteEligibil(varsta)){
            System.out.println("Candidatul este eligibil");
        }
        else{
            System.out.println("Candidatul nu este eligibil");
        }
    }
}
