package clase;

public class Client implements  Observer{
    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Ati primit o notificare: " + mesaj);
    }
}
