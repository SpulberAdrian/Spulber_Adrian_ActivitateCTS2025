package main;

import clase.Departament;
import clase.Sectie;
import clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura MainDepartment = new Departament("Main Department",5);

        Structura Health = new Departament("Healh",45);
        Structura Ortopedica = new Departament("Ortopedica",15);
        Structura Heart = new Departament("Heart",15);
        try {
            Health.adauga(new Sectie("Sectia1",2));
            Ortopedica.adauga(new Sectie("Sectia2",3));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            MainDepartment.adauga(Health);
            MainDepartment.adauga(Ortopedica);
            MainDepartment.adauga(Heart);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        MainDepartment.afiseaza();
        System.out.println(MainDepartment.getNrAngajati());
    }
}
