package clase;

import java.util.ArrayList;
import java.util.List;

public class Banca implements Subiect {
    private List<Observer> lista = new ArrayList<>();

    @Override
    public void adaugaObserver(Observer observer) {
        lista.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        lista.remove(observer);
    }

    @Override
    public void notificaObserver(String mesaj) {
        for (Observer observer:lista){
            observer.primesteNotificare(mesaj);
        }
    }
}
