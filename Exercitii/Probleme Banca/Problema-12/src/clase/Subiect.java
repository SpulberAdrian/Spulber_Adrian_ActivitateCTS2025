package clase;

public interface Subiect {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void notificaObserver(String mesaj);
}
