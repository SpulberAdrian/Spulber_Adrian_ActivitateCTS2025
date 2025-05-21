package clase;

public class Adaptor implements IVanzareBilet{
    private EBilet eBilet;

    public Adaptor(EBilet eBilet) {
        this.eBilet = eBilet;
    }

    @Override
    public void vanzare() {
        eBilet.vindeEBilet();
    }
}
