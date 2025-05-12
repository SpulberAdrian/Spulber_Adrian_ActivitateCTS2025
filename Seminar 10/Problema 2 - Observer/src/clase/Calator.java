package clase;

public class Calator implements Observer {
    String name;

    public Calator(String name) {
        this.name = name;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(this.name + ", ai primit un mesaj: " + mesaj);
    }
}
