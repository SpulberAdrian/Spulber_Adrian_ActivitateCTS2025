package clase;

public class Rezervare implements IRezervare {
    @Override
    public void realizeazaRezervare(int nrPersoane) {
        System.out.println("Rezervare realizata cu succes pentru " + nrPersoane + "persoane");
    }
}
