package clase;

public interface ComponentaMeniu {
    void afiseazaMeniu();
    void adaugaNod(ComponentaMeniu componentaMeniu);
    void stergeNod(ComponentaMeniu componentaMeniu);
    ComponentaMeniu getNod(int index);
}
