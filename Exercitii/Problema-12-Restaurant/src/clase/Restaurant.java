package clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subiect{
    private List<Observer> clienti = new ArrayList<>();
    @Override
    public void adaugareObserver(Observer observer) {
        clienti.add(observer);
    }

    @Override
    public void stergereObserver(Observer observer) {
    clienti.remove(observer);
    }

    @Override
    public void notificareObserver(String mesaj) {
    for(Observer observer : clienti){
        observer.primesteNotificare(mesaj);
        }
    }
}
