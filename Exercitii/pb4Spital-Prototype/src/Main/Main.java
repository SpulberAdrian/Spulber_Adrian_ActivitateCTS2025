package Main;

import Classes.AMedicament;
import Classes.Medicament;

public class Main {
    public static void main(String[] args) {
        AMedicament medicament = new Medicament("Paracetamol", 20,15,"Nu");
        AMedicament medicament1 = medicament.clone();
        AMedicament medicament2 = medicament.clone();
        AMedicament medicament3 = medicament.clone();
        AMedicament medicament4 = medicament.clone();
        System.out.println(medicament1.toString());
        System.out.println(medicament2.toString());
        System.out.println(medicament3.toString());
        System.out.println(medicament4.toString());
    }
}
