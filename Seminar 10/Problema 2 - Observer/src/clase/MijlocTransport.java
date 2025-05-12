package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements  Subject {
    protected int numarLinie;
    private List<Observer> calatori;


    public MijlocTransport(int numarLinie) {
        this.numarLinie = numarLinie;
        this.calatori = new ArrayList<Observer>();
    }
    @Override
    public void adaugaObserver(Observer observabil){
        this.calatori.add(observabil);
    }
    @Override
    public void stergeObserver(Observer observabil){
        this.calatori.remove(observabil);
    }
    @Override
    public void trimiteMesaj(String mesaj){
        for(Observer observabil: calatori){
            observabil.primesteMesaj(mesaj);
        }
    }

    public abstract void pleacaDeLaCapat();
    public abstract void schimbaTraseu();

}
