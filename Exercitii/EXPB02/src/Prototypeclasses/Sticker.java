package Prototypeclasses;

public class Sticker extends ASticker {
    public Sticker(String modelMasina, String anulFabricatiei) {
        super(modelMasina, anulFabricatiei);
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un sticker");
    }

    @Override
    public ASticker clone() {
        Sticker sticker = new Sticker(this.modelMasina, this.anulFabricatiei);
        return sticker;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Prototypeclasses.Sticker{");
        sb.append("modelMasina='").append(modelMasina).append('\'');
        sb.append(", anulFabricatiei='").append(anulFabricatiei).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
