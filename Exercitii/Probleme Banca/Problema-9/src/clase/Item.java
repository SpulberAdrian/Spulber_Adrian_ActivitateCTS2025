package clase;

public class Item extends Componenta{
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    public void afiseaza(){
        System.out.println("-" + nume);
    }
}
