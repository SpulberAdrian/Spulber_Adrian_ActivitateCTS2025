package clase;

public interface Subiect {
    void adauga(Observer observer);
    void sterge(Observer observer);
    void notificare(String mesaj);
}
