package clase;

public class MenuItem implements ComponentaMeniu{

    private String nume;

    public MenuItem(String nume) {
        this.nume = nume;
    }
    @Override
    public void afiseazaMeniu() {
        System.out.println("Item " + nume);
    }
    @Override
    public void adaugaNod(ComponentaMeniu componentaMeniu) {

    }
    @Override
    public void stergeNod(ComponentaMeniu componentaMeniu) {

    }
    @Override
    public ComponentaMeniu getNod(int index) {
        return null;
    }
}
