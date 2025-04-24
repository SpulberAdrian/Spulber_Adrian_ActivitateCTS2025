package Main;

import Clase.BuilderBicicleta;
import Clase.IBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder builder = new BuilderBicicleta();
        builder.cascaProtectie(true).diametruRoti(29).tipFrana("Hidraulica").ochelari(true);
    }

}
