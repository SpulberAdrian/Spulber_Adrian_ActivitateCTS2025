package clase;

public class ClientFidel implements Observer{
    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume+ ", ai o notificare:" + mesaj);
    }
}
