package clase;

public class ClientAbonat implements  Observer{

    private String nume;


    public ClientAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Ati primit o notificare noua: " + mesaj);
    }
}
