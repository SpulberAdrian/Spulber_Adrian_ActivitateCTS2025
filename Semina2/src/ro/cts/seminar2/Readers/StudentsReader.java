package ro.cts.seminar2.Readers;

import ro.cts.seminar2.Clase.Aplicant;
import ro.cts.seminar2.Clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsReader extends BaseReader {

    public StudentsReader(String fileName) {
        super(fileName);
    }

    public  List<Aplicant> readAplicanti() throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(super.getFileName()));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student stud = new Student();
            citireAplicant(stud, input);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            stud.setAn_studii(an_studii);
            stud.setFacultate(facultate);
            studenti.add(stud);
        }
        input.close();
        return studenti;
    }

}
