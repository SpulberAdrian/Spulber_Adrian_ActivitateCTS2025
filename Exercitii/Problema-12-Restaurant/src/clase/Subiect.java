package clase;

public interface Subiect {
    void adaugareObserver(Observer observer);
    void stergereObserver(Observer observer);
    void notificareObserver(String mesaj);
}
