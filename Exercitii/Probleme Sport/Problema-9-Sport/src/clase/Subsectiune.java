package clase;

public class Subsectiune extends Componenta{
    public String nume;

    public Subsectiune(String nume) {
        this.nume = nume;
    }

    public void afiseaza(){
        System.out.println("-" + nume);
    }
}
