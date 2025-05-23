package ro.cts.seminar2.Readers;

import ro.cts.seminar2.Clase.Angajat;
import ro.cts.seminar2.Clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends BaseReader {


    public AngajatiReader(String fileName) {
        super(fileName);
    }

    public  List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.getFileName()));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input2.hasNext()) {
            Angajat angajat = new Angajat();
            citireAplicant(angajat, input2);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }
}
