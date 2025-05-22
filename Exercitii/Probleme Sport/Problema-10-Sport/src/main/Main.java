package main;

import clase.CaracterFactory;
import clase.InformatiiCaracter;
import clase.InformatiiTribuna;

public class Main {
    public static void main(String[] args) {
        CaracterFactory fabrica = new CaracterFactory();

        InformatiiCaracter informatiiCaracter = fabrica.getCaracter(180,40,"ros albastra", 174);

        InformatiiTribuna tribunaSud = new InformatiiTribuna("TribunaSud",informatiiCaracter);
        InformatiiTribuna tribunaNord = new InformatiiTribuna("TribunaNord",informatiiCaracter);

        System.out.println(tribunaSud.toString());
        System.out.println(tribunaNord.toString());
    }
}
