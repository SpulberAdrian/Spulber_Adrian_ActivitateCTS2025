package main;

import clase.VerificatorCentralizat;

public class Main {
    public static void main(String[] args) {
        VerificatorCentralizat verificare = new VerificatorCentralizat();

        if(verificare.verificareCentralizata()){
            System.out.println("Clientul poate intra");
        }else{
            System.out.println("Exista o problema, clientul nu poate intra");
        }
    }
}
