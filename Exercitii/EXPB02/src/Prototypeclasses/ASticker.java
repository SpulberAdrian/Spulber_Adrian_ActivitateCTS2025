package Prototypeclasses;

public abstract class ASticker {
    protected String modelMasina;
    protected String anulFabricatiei;

    public ASticker(String modelMasina, String anulFabricatiei) {
        this.modelMasina = modelMasina;
        this.anulFabricatiei = anulFabricatiei;
    }

    public abstract void descriere();
    public abstract ASticker clone();
}
