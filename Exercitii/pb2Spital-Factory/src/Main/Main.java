package Main;

import Clase.PersonalFactory;
import Clase.PersonalSpital;

import static Clase.Personal.*;

public class Main {
    public static void main(String[] args) {
        PersonalFactory factory = new PersonalFactory(12);
        PersonalSpital Medic = factory.AngajeazaPersonal(MEDIC, 21, 2100);
        PersonalSpital Asistent = factory.AngajeazaPersonal(ASISTENT, 21, 2100);
        PersonalSpital Brancardier = factory.AngajeazaPersonal(BRANCARDIER, 21, 2100);
        System.out.println(Medic);
        System.out.println(Asistent);
        System.out.println(Brancardier);
    }
}
