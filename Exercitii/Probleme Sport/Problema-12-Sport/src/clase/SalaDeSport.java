package clase;

import java.util.ArrayList;
import java.util.List;

public class SalaDeSport implements Subiect{
    private List<Observer> lista = new ArrayList<>();

    @Override
    public void adauga(Observer observer) {
        lista.add(observer);
    }

    @Override
    public void sterge(Observer observer) {
        lista.remove(observer);
    }

    @Override
    public void notificare(String mesaj) {
        for (Observer observer:lista){
            observer.primesteNotificare(mesaj);
        }
    }
}
