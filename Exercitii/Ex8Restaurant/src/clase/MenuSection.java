package clase;

import java.util.ArrayList;
import java.util.List;

public class MenuSection implements ComponentaMeniu{

    private String nume;
    private List<ComponentaMeniu> componente;

    public MenuSection(String nume) {
        this.nume = nume;
        this.componente = new ArrayList<>();
    }

    @Override
    public void afiseazaMeniu() {
        System.out.println("Sectiune " + nume);
        for (ComponentaMeniu componentaMeniu:componente)
            componentaMeniu.afiseazaMeniu();
    }

    @Override
    public void adaugaNod(ComponentaMeniu componentaMeniu) {
        componente.add(componentaMeniu);
    }

    @Override
    public void stergeNod(ComponentaMeniu componentaMeniu) {
        componente.remove(componentaMeniu);
    }

    @Override
    public ComponentaMeniu getNod(int index) {
        return componente.get(index);
    }
}
